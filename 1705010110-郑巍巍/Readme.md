1.开发工具 ：Python
2.运行环境：Windows
3.功能描述：根据相应需求，进行输入，然后得出答案
4.源文件如下：
import easygui as g
import sys
while 1:
        msg="请选择你所需要计算的数据,点击cancle关闭程序"
        title=""
        choices=["存储器容量","存储器价格","开发成本"]
        choice=g.choicebox(msg,title,choices)
        if str(choice)=="None":
                sys.exit(0)
        g.msgbox("你的选择是："+str(choice),"结果")               
        if str(choice)=="存储器容量":
                msg="请填写如下的信息,点击ok进行下一步,点击cancle关闭程序"
                title=""
                fieldNames=["年份"]
                fieldValues=[]
                fieldValues=g.multenterbox(msg,title,fieldNames)
                if str(fieldValues)=="None":
                        sys.exit(0)
                a=fieldValues[0]
                b=int(a)
                m=4080*2.718281828**(0.28*(b-1960))
                n=int(m)
                
                if g.ccbox(str(n)+"字",title="结果如下",choices=("返回","结束")):
                     pass
                else:
                    sys.exit(0)
        if str(choice)=="存储器价格":
                msg="请填写如下的信息,点击ok进行下一步,点击cancle关闭程序"
                title=""
                fieldNames=["年份","计算机字长"]
                fieldValues=[]
                fieldValues=g.multenterbox(msg,title,fieldNames)
                if str(fieldValues)=="None":
                        sys.exit(0)
                a=fieldValues[0]
                c=fieldValues[1]
                d=int(c)
                m=4080*2.718281828**(0.28*(int(a)-1960))
                n=int(m)*0.003*d*(0.72**(int(a)-1974))
                
                if g.ccbox(str(int(n))+"美元",title="结果如下",choices=("返回","结束")):
                     pass
                else:
                    sys.exit(0)
        if str(choice)=="开发成本":
                msg="请填写如下的信息,点击ok进行下一步,点击cancle关闭程序"
                title=""
                fieldNames=["年份","程序员工资","程序员开发指令数"]
                fieldValues=[]
                fieldValues=g.multenterbox(msg,title,fieldNames)
                if str(fieldValues)=="None":
                        sys.exit(0)
                a=fieldValues[0]
                d=int(fieldValues[2])*20
                m=4080*2.718281828**(0.28*(int(a)-1960))
                e=m/d
                v=int(e)*6000
                print(int(e))
                print(v)
                f=int(e)*int(fieldValues[1])
                if g.ccbox(str(int(f))+"美元",title="结果如下",choices=("返回","结束")):
                     pass
                else:
                    sys.exit(0)
