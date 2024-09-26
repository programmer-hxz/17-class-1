﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace WpfApp1.Triton.Common.Codecompiler
{
    using log4net;
    using Microsoft.CSharp;
    using System;
    using System.CodeDom.Compiler;
    using System.Collections;
    using System.Collections.Generic;
    using System.Globalization;
    using System.IO;
    using System.Linq;
    using System.Reflection;
    using System.Resources;
    using System.Runtime.CompilerServices;

    public class CodeCompiler
    {
        private static readonly ILog ilog_0 = LogUtilities.LogManagers.GetLoggerInstanceForType();
        private static string string_0;
        private static string string_1;
        [CompilerGenerated]
        private Assembly assembly_0;
        [CompilerGenerated]
        private string string_2;
        [CompilerGenerated]
        private FileStructureType fileStructureType_0;
        [CompilerGenerated]
        private CompilerParameters compilerParameters_0;
        [CompilerGenerated]
        private float float_0;
        [CompilerGenerated]
        private string string_3;
        [CompilerGenerated]
        private List<string> list_0;
        private readonly List<string> list_1 = new List<string>();
        private readonly List<Stream> list_2 = new List<Stream>();
        private ResourceWriter resourceWriter_0;

        static CodeCompiler()
        {
            smethod_1();
        }

        public CodeCompiler(string path)
        {
            this.CompilerVersion = 4f;
            this.SourceFilePaths = new List<string>();
            if (File.Exists(path))
            {
                this.FileStructure = FileStructureType.SingleFile;
            }
            else if (Directory.Exists(path))
            {
                this.FileStructure = FileStructureType.Folder;
            }
            this.SourcePath = path;
            CompilerParameters parameters1 = new CompilerParameters
            {
                GenerateExecutable = false,
                GenerateInMemory = false,
                IncludeDebugInformation = true
            };
            this.Options = parameters1;
            string str = "HSB_" + Assembly.GetEntryAssembly().GetName().Version.Revision;
            this.Options.CompilerOptions = $"/d:HSB;{str} /unsafe";
            this.Options.TempFiles = new TempFileCollection(Path.GetTempPath());
            this.Options.OutputAssembly = Path.Combine(CompiledAssemblyPath, this.AssemblyName);
            this.CompiledToLocation = this.Options.OutputAssembly;
            foreach (Assembly assembly in AppDomain.CurrentDomain.GetAssemblies())
            {
                try
                {
                    string location = assembly.Location;
                    if (assembly == Assembly.GetEntryAssembly())
                    {
                        location = string_0;
                    }
                    this.AddReference(location);
                }
                catch (NotSupportedException)
                {
                }
            }
        }

        public void AddReference(string assembly)
        {
            if (!this.Options.ReferencedAssemblies.Contains(assembly))
            {
                this.Options.ReferencedAssemblies.Add(assembly);
            }
        }

        public CompilerResults Compile()
        {
            this.method_2();
            this.method_3();
            if (this.SourceFilePaths.Count == 0)
            {
                if (this.resourceWriter_0 != null)
                {
                    this.resourceWriter_0.Close();
                    this.resourceWriter_0.Dispose();
                    this.resourceWriter_0 = null;
                }
                foreach (Stream stream2 in this.list_2)
                {
                    try
                    {
                        stream2.Close();
                        stream2.Dispose();
                    }
                    catch
                    {
                    }
                }
                this.list_2.Clear();
                foreach (string str2 in this.list_1)
                {
                    try
                    {
                        File.Delete(str2);
                    }
                    catch
                    {
                    }
                }
                this.list_1.Clear();
                return null;
            }
            Dictionary<string, string> providerOptions = new Dictionary<string, string>
            {
                { "CompilerVersion", string.Format((IFormatProvider)CultureInfo.InvariantCulture.NumberFormat, "v{0:N1}", this.CompilerVersion) }
            };
            using (CSharpCodeProvider provider = new CSharpCodeProvider(providerOptions))
            {
                provider.Supports(GeneratorSupport.Resources);
                if (this.resourceWriter_0 != null)
                {
                    this.resourceWriter_0.Close();
                    this.resourceWriter_0.Dispose();
                    this.resourceWriter_0 = null;
                }
                foreach (Stream stream in this.list_2)
                {
                    try
                    {
                        stream.Close();
                        stream.Dispose();
                    }
                    catch
                    {
                    }
                }
                this.list_2.Clear();
                CompilerResults results = provider.CompileAssemblyFromFile(this.Options, this.SourceFilePaths.ToArray());
                if (!results.Errors.HasErrors)
                {
                    this.CompiledAssembly = results.CompiledAssembly;
                }
                results.TempFiles.Delete();
                foreach (string str in this.list_1)
                {
                    try
                    {
                        File.Delete(str);
                    }
                    catch
                    {
                    }
                }
                this.list_1.Clear();
                return results;
            }
        }

        private void method_0(string string_4)
        {
            if (this.resourceWriter_0 == null)
            {
                string fileName = Path.GetFileNameWithoutExtension(this.AssemblyName) + ".g.resources";
                this.resourceWriter_0 = new ResourceWriter(fileName);
                this.Options.EmbeddedResources.Add(fileName);
                this.list_1.Add(fileName);
            }
            FileStream item = new FileStream(string_4, FileMode.Open, FileAccess.Read);
            this.list_2.Add(item);
            this.resourceWriter_0.AddResource(Path.GetFileName(string_4).ToLowerInvariant(), (Stream)item);
        }

        private void method_1(string string_4)
        {
            string path = Path.ChangeExtension(string_4, ".resources");
            if (File.Exists(path))
            {
                File.Delete(path);
            }
            using (System.Resources.ResXResourceReader reader = new ResXResourceReader(string_4))
            {
                reader.BasePath = this.SourcePath;
                using (ResourceWriter writer = new ResourceWriter(path))
                {
                    foreach (DictionaryEntry entry in reader)
                    {
                        writer.AddResource(entry.Key.ToString(), entry.Value);
                    }
                }
            }
            this.Options.EmbeddedResources.Add(path);
        }

        private void method_2()
        {
            if (this.FileStructure != FileStructureType.Folder)
            {
                this.SourceFilePaths.Add(this.SourcePath);
            }
            else
            {
                foreach (string str in Directory.GetFiles(this.SourcePath, "*.resx", SearchOption.AllDirectories))
                {
                    this.method_1(str);
                }
                bool flag = false;
                foreach (string str2 in Directory.GetFiles(this.SourcePath, "*.baml", SearchOption.AllDirectories))
                {
                    flag = true;
                    this.method_0(str2);
                }
                foreach (string str3 in Directory.GetFiles(this.SourcePath, "*.cs", SearchOption.AllDirectories))
                {
                    if (str3.ToLowerInvariant().Contains(".g.cs"))
                    {
                        if (flag)
                        {
                            this.SourceFilePaths.Add(str3);
                        }
                    }
                    else if (!str3.ToLowerInvariant().Contains(".xaml.cs"))
                    {
                        this.SourceFilePaths.Add(str3);
                    }
                    else if (flag)
                    {
                        this.SourceFilePaths.Add(str3);
                    }
                }
            }
        }

        private void method_3()
        {
            using (List<string>.Enumerator enumerator = this.SourceFilePaths.GetEnumerator())
            {
                while (enumerator.MoveNext())
                {
                    string[] strArray = File.ReadAllLines(enumerator.Current);
                    for (int i = 0; i < strArray.Length; i++)
                    {
                        string str = strArray[i].Trim();
                        if (str.StartsWith("//!CompilerOption|"))
                        {
                            char[] separator = new char[] { '|' };
                            string[] strArray2 = str.Split(separator, StringSplitOptions.RemoveEmptyEntries);
                            string str2 = strArray2[1];
                            if (str2 == "AddRef")
                            {
                                if (((strArray2.Length == 3) && (!string.IsNullOrEmpty(strArray2[2]) && (strArray2[2].EndsWith(".dll") && !smethod_2(strArray2[2])))) && !strArray2[2].ToLowerInvariant().Contains("WpfApp1.exe"))
                                {
                                    this.AddReference(strArray2[2]);
                                }
                            }
                            else if (str2 != "Optimize")
                            {
                                if (((str2 == "Define") && (strArray2.Length == 3)) && !string.IsNullOrEmpty(strArray2[2]))
                                {
                                    CompilerParameters options = this.Options;
                                    options.CompilerOptions = options.CompilerOptions + " /d:" + strArray2[2] + ";";
                                }
                            }
                            else if (((strArray2.Length == 3) && (!string.IsNullOrEmpty(strArray2[2]) && (strArray2[2] == "On"))) && !this.Options.CompilerOptions.Contains("/optimize;"))
                            {
                                this.Options.IncludeDebugInformation = false;
                                CompilerParameters options = this.Options;
                                options.CompilerOptions = options.CompilerOptions + " /optimize";
                            }
                        }
                    }
                }
            }
        }

        internal static void smethod_0(string string_4)
        {
            string_0 = string_4;
        }

        private static void smethod_1()
        {
            string path = Path.Combine(Path.GetDirectoryName(Assembly.GetExecutingAssembly().Location), "CompiledAssemblies");
            if (!Directory.Exists(path))
            {
                Directory.CreateDirectory(path);
            }
            foreach (string str2 in Directory.GetFiles(path, "*.*", SearchOption.AllDirectories))
            {
                try
                {
                    File.Delete(str2);
                }
                catch (Exception)
                {
                }
            }
            foreach (string str3 in Directory.GetDirectories(path))
            {
                try
                {
                    Directory.Delete(str3);
                }
                catch (Exception)
                {
                }
            }
            if (!Directory.Exists(CompiledAssemblyPath))
            {
                Directory.CreateDirectory(CompiledAssemblyPath);
            }
        }

        private static bool smethod_2(string string_4)
        {
            Class230 class2 = new Class230
            {
                string_0 = string_4
            };
            return AppDomain.CurrentDomain.GetAssemblies().Any<Assembly>(new Func<Assembly, bool>(class2.method_0));
        }

        public static string CompiledAssemblyPath
        {
            get
            {
                string result;
                if ((result = CodeCompiler.string_1) == null)
                {
                    result = (CodeCompiler.string_1 = Path.Combine(Path.GetDirectoryName(Assembly.GetExecutingAssembly().Location), string.Format("CompiledAssemblies\\{0}", Environment.TickCount)));
                }
                return result;
            }
        }

        public Assembly CompiledAssembly
        {
            [CompilerGenerated]
            get
            {
                return this.assembly_0;
            }
            [CompilerGenerated]
            private set
            {
                this.assembly_0 = value;
            }
        }

        public string SourcePath
        {
            [CompilerGenerated]
            get
            {
                return this.string_2;
            }
            [CompilerGenerated]
            private set
            {
                this.string_2 = value;
            }
        }

        public FileStructureType FileStructure
        {
            [CompilerGenerated]
            get
            {
                return this.fileStructureType_0;
            }
            [CompilerGenerated]
            private set
            {
                this.fileStructureType_0 = value;
            }
        }

        public CompilerParameters Options
        {
            [CompilerGenerated]
            get
            {
                return this.compilerParameters_0;
            }
            [CompilerGenerated]
            private set
            {
                this.compilerParameters_0 = value;
            }
        }

        public float CompilerVersion
        {
            [CompilerGenerated]
            get
            {
                return this.float_0;
            }
            [CompilerGenerated]
            private set
            {
                this.float_0 = value;
            }
        }

        public string AssemblyName =>
            $"{((this.FileStructure == FileStructureType.SingleFile) ? Path.GetFileNameWithoutExtension(this.SourcePath) : new DirectoryInfo(this.SourcePath).Name)}.dll";

        public string CompiledToLocation
        {
            [CompilerGenerated]
            get
            {
                return this.string_3;
            }
            [CompilerGenerated]
            private set
            {
                this.string_3 = value;
            }
        }

        public List<string> SourceFilePaths
        {
            [CompilerGenerated]
            get
            {
                return this.list_0;
            }
            [CompilerGenerated]
            private set
            {
                this.list_0 = value;
            }
        }

        [CompilerGenerated]
        private sealed class Class230
        {
            public string string_0;

            internal bool method_0(Assembly assembly_0) =>
                assembly_0.GetName().Name.Contains(this.string_0.Replace(".dll", string.Empty));
        }

        public enum FileStructureType
        {
            SingleFile,
            Folder
        }
    }
}

