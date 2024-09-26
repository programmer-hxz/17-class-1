package homework;
import java.awt.Dimension;//构架高度宽度
import java.awt.Toolkit;//工具类
import java.awt.event.ActionEvent;//动作事件
import java.awt.event.ActionListener;//监听器

import javax.swing.JButton;//按钮
import javax.swing.JFrame;//顶级容器
import javax.swing.JLabel;//标签组件
import javax.swing.JTextField;//输入框组件

public class homework {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("计算 ");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 100) / 2, ((int)dimension.getHeight() - 100) / 2, 500, 400);
		jFrame.setResizable(true);//能自由改变大小
		jFrame.setLayout(null);//绝对布局
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
		
		JLabel label1 = new JLabel("输入当前年份");
		label1.setBounds(40, 10, 100, 30);
		jFrame.add(label1);
		 
		JLabel label2 = new JLabel("输入字长");
		label2.setBounds(40, 40, 100, 30);
		jFrame.add(label2);
		
		JLabel label3 = new JLabel("输入程序员月薪");
		label3.setBounds(40, 70, 100, 30);
		jFrame.add(label3);
		
		JLabel label4 = new JLabel("每天指令条数");
		label4.setBounds(40, 100, 100, 30);
		jFrame.add(label4);
		
		JLabel label5 = new JLabel("存储器价格");
		label5.setBounds(40, 210, 100, 30);
		jFrame.add(label5);
		
		JLabel label6 = new JLabel("成本");
		label6.setBounds(40, 240, 100, 30);
		jFrame.add(label6);
		
		
		
		
		final JTextField text1 = new JTextField();
		text1.setBounds(130, 15, 70, 20);
		jFrame.add(text1);
		
		final JTextField text2 = new JTextField();
		text2.setBounds(100, 45, 70, 20);
		jFrame.add(text2);
		
		final JTextField text3 = new JTextField();
		text3.setBounds(140, 75, 70, 20);
		jFrame.add(text3);
		
		final JTextField text4 = new JTextField();
		text4.setBounds(130, 105, 70, 20);
		jFrame.add(text4);
		
		final JTextField text5 = new JTextField();
		text5.setBounds(110, 215, 70, 20);
		jFrame.add(text5);
		
		final JTextField text6 = new JTextField();
		text6.setBounds(80, 245, 70, 20);
		jFrame.add(text6);
		
		JButton button1 = new JButton("价格");
		button1.setBounds(40, 145, 70, 40);
		JButton button2 = new JButton("成本");
		button2.setBounds(130, 145, 70, 40);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				  int b= Integer.parseInt(text1.getText());
				  int c= Integer.parseInt(text2.getText());
				  int M=(int)(4080*Math.pow(Math.E,0.28*(b-1960)));
				  int price=(int)(0.003*c*Math.pow(0.72,(b-1974))*M);
				  text5.setText(price+"");
				}
		});
        button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent b) {
				  int a= Integer.parseInt(text1.getText());
				  int M=(int)(4080*Math.pow(Math.E,0.28*(a-1960)));
				  int c=(int)(M/200);
				  int cb=(int)(c*4000);
				  text6.setText(cb +"");
				}
		});
		jFrame.add(button1);
		jFrame.add(button2);
		jFrame.setVisible(true);//窗口可见
}
}
