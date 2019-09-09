## 1.开发工具：eclipse 语言：Java

## 2.运行环境：JDK

## 3.功能描述
通过输入年份，字长，每月工资，每天开发指令数和每月工作天数，计算出存储容量需求，存储器价格和成本。

## 4.源代码
CCQ.java
```
package rjgc1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CCQ extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final JLabel lblNewLabel_2 = new JLabel("每天开发指令数");
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCQ frame = new CCQ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CCQ() {
		setTitle("\u5B58\u50A8\u8BA1\u7B97");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		lblNewLabel_2.setBounds(31, 40, 91, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("年份Y");
		lblNewLabel_1.setBounds(31, 8, 58, 15);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 5, 75, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("字长");
		lblNewLabel.setBounds(229, 8, 58, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(315, 5, 75, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 37, 75, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(315, 37, 75, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 68, 75, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("每月工资");
		lblNewLabel_3.setBounds(31, 71, 58, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("每月工作天数");
		lblNewLabel_4.setBounds(229, 40, 79, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("存储容量需求M");
		lblNewLabel_5.setBounds(10, 140, 91, 15);
		panel.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(99, 137, 66, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("存储器价格");
		lblNewLabel_6.setBounds(175, 140, 66, 15);
		panel.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(247, 137, 75, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("成本");
		lblNewLabel_7.setBounds(332, 140, 58, 15);
		panel.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(359, 137, 66, 21);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("计算");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double y=Double.parseDouble(textField_1.getText());
				double zc=Double.parseDouble(textField.getText());
				double gz=Double.parseDouble(textField_4.getText());
				double zls=Double.parseDouble(textField_2.getText());
				double d=Double.parseDouble(textField_3.getText());
				double m=4080*Math.pow(Math.E, 0.28*(y-1960));
				double p=0.003*zc*Math.pow(0.72, y-1974)*m;
				double cb=(m/(zls*d))*gz;
				textField_5.setText(String.valueOf(String.format("%.1f", m)));
				textField_6.setText(String.valueOf(String.format("%.1f", p)));
				textField_7.setText(String.valueOf(String.format("%.1f", cb)));
			}
		});
		btnNewButton.setBounds(97, 214, 97, 23);
		panel.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("退出");
		btnNewButton_1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(257, 214, 97, 23);
		panel.add(btnNewButton_1);
	}
}

```
