#!/usr/bin/env python
# -*- coding: utf-8 -*-
# author:洪卫

import tkinter as tk  # 使用Tkinter前需要先导入
import math
class math5:
	def __init__(self):
		self.y = 0
		self.Bit = 0
		self.Line = 0
		self.Salary = 0
	def getM(self):  # 1
		Y = int(Entry_Years.get())
		return round(4080 * math.exp(0.28 * (Y - 1960)))
	def getP1(self):
		Y = int(Entry_Years.get())
		return 0.3 * math.pow(0.72, Y - 1974) * 8
	def getP2(self):
		Y = int(Entry_Years.get())
		return 0.048 * math.pow(0.72, Y - 1974)
	def getPrice(self):
		Bit = int(Entry_Bit.get())
		if Bit==16 or Bit==32:
			return round(Bit / 8 * self.getM() * self.getP2())
		else:
			return round(Bit * self.getM() * self.getP1())
	def getCost(self):
		Y = int(Entry_Years.get())
		Line = int(Entry_Line.get())
		Salary = int(Entry_Salary.get())
		return round(self.getM() * Salary / Line / 30)

	def setM(self):
		Text_Needs.insert('end', str(self.getM())+'字数')
	def setPrice(self):
		Text_Price.insert('end', str(self.getPrice())+'美元')
	def setCost(self):
		Text_Cost.insert('end', str(self.getCost())+'美元')

math55 =math5()

window = tk.Tk()
window.title('作业第五题')
window.geometry('400x200')
Label_Years = tk.Label(window, text='年份:', width=10)
Entry_Years = tk.Entry(window, show=None, width=10)
Button_Needs = tk.Button(window, text='存储器需求:', width=10, command=math55.setM)
Text_Needs = tk.Text(window, width=20, height=2)

Label_Bit = tk.Label(window, text='字长:', width=10, height=2)
Entry_Bit = tk.Entry(window, width=10)
Button_Price = tk.Button(window, text='价格:', width=10, height=1, command=math55.setPrice)
Text_Price = tk.Text(window, width=20, height=2)

Label_Line = tk.Label(window, text='指令/天:', width=10, height=2)
Entry_Line = tk.Entry(window, width=10,)
Label_Salary = tk.Label(window, text='工资/月:', width=10, height=2)
Entry_Salary = tk.Entry(window, width=12)

Button_Cost = tk.Button(window, text='装满存储器成本:', width=12, height=2, command=math55.setCost)
Text_Cost = tk.Text(window, width=15, height=2)

Label_Years.grid(row=0, column=0)
Entry_Years.grid(row=0, column=1)
Button_Needs.grid(row=0, column=2)
Text_Needs.grid(row=0, column=3)

Label_Bit.grid(row=1, column=0)
Entry_Bit.grid(row=1, column=1)
Button_Price.grid(row=1, column=2)
Text_Price.grid(row=1, column=3)

Label_Line.grid(row=2, column=0)
Entry_Line.grid(row=2, column=1)
Label_Salary.grid(row=2, column=2)
Entry_Salary.grid(row=2, column=3)

Button_Cost.grid(row=3, column=0)
Text_Cost.grid(row=3, column=2)

window.mainloop()
