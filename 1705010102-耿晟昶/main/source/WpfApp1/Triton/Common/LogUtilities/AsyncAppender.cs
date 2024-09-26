﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace WpfApp1.Triton.Common.LogUtilities
{
    using log4net.Appender;
    using log4net.Core;
    using log4net.Util;
    using System;
    using System.Collections.Concurrent;
    using System.Diagnostics;
    using System.Runtime.CompilerServices;
    using System.Threading;

    public sealed class AsyncAppender : IAppender, IBulkAppender, IOptionHandler, IAppenderAttachable
    {
        private AppenderAttachedImpl appenderAttachedImpl_0;
        private FixFlags fixFlags_0 = FixFlags.All;
        [CompilerGenerated]
        private string string_0;
        private string string_1 = "";
        private readonly Stopwatch stopwatch_0 = Stopwatch.StartNew();
        private readonly ConcurrentQueue<object> concurrentQueue_0 = new ConcurrentQueue<object>();
        private readonly object object_0 = new object();

        public void ActivateOptions()
        {
        }

        public void AddAppender(IAppender newAppender)
        {
            if (newAppender == null)
            {
                throw new ArgumentNullException("newAppender");
            }
            AsyncAppender appender = this;
            lock (appender)
            {
                if (this.appenderAttachedImpl_0 == null)
                {
                    this.appenderAttachedImpl_0 = new AppenderAttachedImpl();
                }
                this.appenderAttachedImpl_0.AddAppender(newAppender);
            }
        }

        public void Close()
        {
            AsyncAppender appender = this;
            lock (appender)
            {
                if (this.appenderAttachedImpl_0 != null)
                {
                    this.appenderAttachedImpl_0.RemoveAllAppenders();
                }
            }
        }

        public void DoAppend(LoggingEvent loggingEvent)
        {
            if ((this.string_1 != loggingEvent.RenderedMessage) || (this.stopwatch_0.ElapsedMilliseconds >= 0x3e8L))
            {
                this.string_1 = loggingEvent.RenderedMessage;
                this.stopwatch_0.Restart();
                loggingEvent.Fix = this.fixFlags_0;
                this.concurrentQueue_0.Enqueue(loggingEvent);
                ThreadPool.QueueUserWorkItem(new WaitCallback(this.method_0));
            }
        }

        public void DoAppend(LoggingEvent[] loggingEvents)
        {
            LoggingEvent[] eventArray = loggingEvents;
            for (int i = 0; i < eventArray.Length; i++)
            {
                eventArray[i].Fix = this.fixFlags_0;
            }
            this.concurrentQueue_0.Enqueue(loggingEvents);
            ThreadPool.QueueUserWorkItem(new WaitCallback(this.method_0));
        }

        public IAppender GetAppender(string name)
        {
            IAppender appender2;
            AsyncAppender appender = this;
            lock (appender)
            {
                if ((this.appenderAttachedImpl_0 == null) || (name == null))
                {
                    appender2 = null;
                }
                else
                {
                    appender2 = this.appenderAttachedImpl_0.GetAppender(name);
                }
            }
            return appender2;
        }

        private void method_0(object object_1)
        {
            object obj2 = this.object_0;
            lock (obj2)
            {
                while (this.concurrentQueue_0.TryDequeue(out object obj3))
                {
                    if (this.appenderAttachedImpl_0 == null)
                    {
                        continue;
                    }
                    if (obj3 as LoggingEvent != null)
                    {
                        this.appenderAttachedImpl_0.AppendLoopOnAppenders(obj3 as LoggingEvent);
                        continue;
                    }
                    if (obj3 is LoggingEvent[] loggingEvents)
                    {
                        this.appenderAttachedImpl_0.AppendLoopOnAppenders(loggingEvents);
                    }
                }
            }
        }

        public void RemoveAllAppenders()
        {
            AsyncAppender appender = this;
            lock (appender)
            {
                if (this.appenderAttachedImpl_0 != null)
                {
                    this.appenderAttachedImpl_0.RemoveAllAppenders();
                    this.appenderAttachedImpl_0 = null;
                }
            }
        }

        public IAppender RemoveAppender(IAppender appender)
        {
            AsyncAppender appender2 = this;
            lock (appender2)
            {
                if ((appender != null) && (this.appenderAttachedImpl_0 != null))
                {
                    return this.appenderAttachedImpl_0.RemoveAppender(appender);
                }
            }
            return null;
        }

        public IAppender RemoveAppender(string name)
        {
            AsyncAppender appender = this;
            lock (appender)
            {
                if ((name != null) && (this.appenderAttachedImpl_0 != null))
                {
                    return this.appenderAttachedImpl_0.RemoveAppender(name);
                }
            }
            return null;
        }

        public FixFlags Fix
        {
            get
            {
                return this.fixFlags_0;
            }
            set
            {
                this.fixFlags_0 = value;
            }
        }

        public string Name
        {
            [CompilerGenerated]
            get
            {
                return this.string_0;
            }
            [CompilerGenerated]
            set
            {
                this.string_0 = value;
            }
        }

        public AppenderCollection Appenders
        {
            get
            {
                AsyncAppender appender = this;
                lock (appender)
                {
                    return ((this.appenderAttachedImpl_0 != null) ? this.appenderAttachedImpl_0.Appenders : AppenderCollection.EmptyCollection);
                }
            }
        }
    }
}

