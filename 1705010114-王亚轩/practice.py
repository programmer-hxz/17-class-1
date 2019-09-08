import tkinter as tk
import math

def storage_demand():
	year = e1.get()
	year = int(year)
	if year>=1960:
		m = str(int(4080*(math.e**(0.28*(year-1960)))))+'字'
	else:
		m = '请输入正确年份'
	result.config(text=m)
	
def storage_price():
	year = e1.get()
	bit = var.get()
	year = int(year)
	bit = int(bit)
	if year>=1960:
		m = 4080*(math.e**(0.28*(year-1960)))
		n = bit*0.003*(0.72**(year-1974))
		x = str(int(m*n))+'美元'
	else:
		x = '请输入正确年份'
	result.config(text=x)
	
def cost():
	year = e1.get()
	payment = e2.get()
	code = e3.get()
	year = int(year)
	payment = int(payment)
	code = int(code)
	if year>=1960:
		m = 4080*(math.e**(0.28*(year-1960)))
		x=str(int(payment*m/(code*20)))+'美元'
	else:
		x = '请输入正确年份'
	result.config(text=x)
	
def menu():
	menubar = tk.Menu(window)
	filemenu = tk.Menu(menubar, tearoff=0)
	menubar.add_cascade(label='menu', menu=filemenu)
	filemenu.add_command(label='Exit', command=window.quit)
	window.config(menu=menubar)

def main():
	global e1,e2,e3,window,result,var
	window = tk.Tk()
	var=tk.StringVar()
	var.set(16)
	window.title('计算机容量问题计算')
	window.geometry('500x400')
	menu()
	l1 = tk.Label(window, text='输入年份')
	l2 = tk.Label(window, text='输入程序员薪水')
	l3 = tk.Label(window, text='输入程序员每天开发指令')
	b1 = tk.Button(window, text='计算容量需求', font=('Arial', 12), width=12, height=1, command=storage_demand)
	b2 = tk.Button(window, text='计算存储器价格', font=('Arial', 12), width=12, height=1, command=storage_price)
	b3 = tk.Button(window, text='计算所需成本', font=('Arial', 12), width=12, height=1, command=cost)
	e1 = tk.Entry(window, show=None, font=('Arial', 14))
	e2 = tk.Entry(window, show=None, font=('Arial', 14))
	e3 = tk.Entry(window, show=None, font=('Arial', 14))
	result = tk.Label(window, text='   ', bg='white', font=('Arial', 12), width=30, height=2)
	r1 = tk.Radiobutton(window, text='16位', variable=var, value=16)
	r2 = tk.Radiobutton(window, text='32位', variable=var, value=32)
	r3 = tk.Radiobutton(window, text='64位', variable=var, value=64)
	r1.pack().after()
	r2.pack().after()
	r3.pack()
	l1.pack()
	e1.pack()
	l2.pack()
	e2.pack()
	l3.pack()
	e3.pack()
	b1.pack()
	b2.pack()
	b3.pack()
	result.pack()
	window.mainloop()
main()
