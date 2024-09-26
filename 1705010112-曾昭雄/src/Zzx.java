package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zzx {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zzx window = new Zzx();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zzx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 733, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("年份");
		lblNewLabel.setBounds(45, 61, 72, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("字长");
		lblNewLabel_1.setBounds(400, 65, 72, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("指令");
		lblNewLabel_2.setBounds(45, 144, 72, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("工资");
		lblNewLabel_3.setBounds(400, 157, 72, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(132, 56, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(510, 59, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 139, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(510, 147, 86, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(245, 242, 140, 24);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(245, 299, 140, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(245, 359, 140, 24);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("计算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double y=Double.parseDouble(textField.getText());
				double zc=Double.parseDouble(textField_1.getText());
			    double zl=Double.parseDouble(textField_2.getText());
			    double gz=Double.parseDouble(textField_3.getText());
			    double m=4080*Math.pow(Math.E,0.28*(y-1960));
				double p=0.003*zc*Math.pow(0.72,y-1974)*m;
				double cb=(m/(zl*20))*gz;
				textField_4.setText("储存器需求:"+String.valueOf( String.format("%.1f", m))+"字");
				textField_5.setText("储存器成本:"+String.valueOf(String.format("%.1f", cb))+"美元");
				textField_6.setText("储存器价格:"+String.valueOf(String.format("%.1f", p))+"美元");
			}
		});
		btnNewButton.setBounds(256, 200, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
		label = new JLabel("\u8BF7\u8F93\u5165");
		label.setBounds(283, 16, 72, 18);
		frame.getContentPane().add(label);
	}
}
