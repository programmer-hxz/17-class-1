1.�������� ��Python
2.���л�����Windows
3.����������������Ӧ���󣬽������룬Ȼ��ó���
4.Դ�ļ����£�
import easygui as g
import sys
while 1:
        msg="��ѡ��������Ҫ���������,���cancle�رճ���"
        title=""
        choices=["�洢������","�洢���۸�","�����ɱ�"]
        choice=g.choicebox(msg,title,choices)
        if str(choice)=="None":
                sys.exit(0)
        g.msgbox("���ѡ���ǣ�"+str(choice),"���")               
        if str(choice)=="�洢������":
                msg="����д���µ���Ϣ,���ok������һ��,���cancle�رճ���"
                title=""
                fieldNames=["���"]
                fieldValues=[]
                fieldValues=g.multenterbox(msg,title,fieldNames)
                if str(fieldValues)=="None":
                        sys.exit(0)
                a=fieldValues[0]
                b=int(a)
                m=4080*2.718281828**(0.28*(b-1960))
                n=int(m)
                
                if g.ccbox(str(n)+"��",title="�������",choices=("����","����")):
                     pass
                else:
                    sys.exit(0)
        if str(choice)=="�洢���۸�":
                msg="����д���µ���Ϣ,���ok������һ��,���cancle�رճ���"
                title=""
                fieldNames=["���","������ֳ�"]
                fieldValues=[]
                fieldValues=g.multenterbox(msg,title,fieldNames)
                if str(fieldValues)=="None":
                        sys.exit(0)
                a=fieldValues[0]
                c=fieldValues[1]
                d=int(c)
                m=4080*2.718281828**(0.28*(int(a)-1960))
                n=int(m)*0.003*d*(0.72**(int(a)-1974))
                
                if g.ccbox(str(int(n))+"��Ԫ",title="�������",choices=("����","����")):
                     pass
                else:
                    sys.exit(0)
        if str(choice)=="�����ɱ�":
                msg="����д���µ���Ϣ,���ok������һ��,���cancle�رճ���"
                title=""
                fieldNames=["���","����Ա����","����Ա����ָ����"]
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
                if g.ccbox(str(int(f))+"��Ԫ",title="�������",choices=("����","����")):
                     pass
                else:
                    sys.exit(0)
