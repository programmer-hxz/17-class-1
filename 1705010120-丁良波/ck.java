package lhq_ruanjian;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ck extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ck frame = new ck();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ck() {
		setTitle("\u5B58\u50A8\u5668\u6210\u672C\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 605, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(214, 86, 234, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 159, 234, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(214, 122, 234, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("\u9700\u6C42\u4F30\u8BA1");
		label.setBounds(120, 89, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C");
		label_1.setBounds(120, 123, 66, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u4EBA\u529B\u6210\u672C");
		label_2.setBounds(120, 162, 54, 15);
		contentPane.add(label_2);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.exit(0);
			}
		});
		button_1.setBounds(450, 381, 93, 23);
		contentPane.add(button_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(214, 268, 128, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(214, 303, 128, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(214, 334, 128, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(214, 232, 128, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u5B58\u50A8\u5B57\u957F");
		label_3.setBounds(94, 268, 110, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u8BF7\u8F93\u5165\u6307\u4EE4\u6761\u6570");
		label_4.setBounds(94, 302, 93, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u8BF7\u8F93\u5165\u5E73\u5747\u5DE5\u8D44");
		label_5.setBounds(94, 337, 110, 15);
		contentPane.add(label_5);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Year = Integer.parseInt(textField_6.getText().trim());
				int ZiChang = Integer.parseInt(textField_3.getText().trim());
				int ZhiLing = Integer.parseInt(textField_4.getText().trim());
				int Salary = Integer.parseInt(textField_5.getText().trim());
				
				double Ned = 4080*Math.exp(0.28*(Year-1960));
				double Price = Ned*0.003*Math.pow(0.72, Year-1974)*ZiChang;
				double ChengBen = Ned/ZhiLing/30*Salary;

				textField.setText(Ned+"");
				textField_1.setText(Price+"");
				textField_2.setText(ChengBen+"");
				
			}
		});
		button.setBounds(94, 381, 93, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("\u6E05\u9664");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				
			}
		});
		button_2.setBounds(271, 381, 93, 23);
		contentPane.add(button_2);
		
		JLabel label_6 = new JLabel("\u9884\u6D4B\u7ED3\u679C");
		label_6.setBounds(271, 37, 54, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u9884\u6D4B\u6570\u636E\u8F93\u5165");
		label_7.setBounds(262, 205, 102, 15);
		contentPane.add(label_7);
		
		
		JLabel label_8 = new JLabel("\u8BF7\u8F93\u5165\u9884\u6D4B\u5E74\u4EFD");
		label_8.setBounds(94, 233, 93, 15);
		contentPane.add(label_8);
	}
}
