import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class zy extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblyesno;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
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
					zy frame = new zy();
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
	public zy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("输入计算年份");
		label.setBounds(22, 27, 95, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(96, 24, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("字长16位");
		label_1.setBounds(203, 27, 78, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 24, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("指   令   数");
		label_2.setBounds(22, 69, 72, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 66, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("程序员工资");
		lblNewLabel.setBounds(203, 69, 66, 15);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(267, 66, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblyesno = new JLabel("\uFF081/0\uFF09");
		lblyesno.setBounds(329, 27, 66, 15);
		contentPane.add(lblyesno);
		
		
		lblNewLabel_1 = new JLabel("\u5B58\u50A8\u5185\u5B58\u5BB9\u91CF");
		lblNewLabel_1.setBounds(22, 153, 95, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\u5B58\u50A8\u5668\u7684\u4EF7\u683C");
		lblNewLabel_2.setBounds(22, 178, 95, 15);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\u5F00\u53D1\u6240\u9700\u6210\u672C");
		lblNewLabel_3.setBounds(22, 203, 95, 15);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton = new JButton("确认计算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double y=0;
				double zc=0;
				double zl=0;
				double gz=0;
				double p;
			 y=Double.parseDouble(textField.getText());
			 zc=Double.parseDouble(textField_1.getText());
			 zl=Double.parseDouble(textField_2.getText());
			 gz=Double.parseDouble(textField_3.getText());
			double M=4080*Math.pow(Math.E, 0.28*(y-1960));
			double cb=(M/(zl*20))*gz;
			if( zc==1)
			{
				 p=0.003*Math.pow(0.72, y-1974)*M*32;
			}
			else {
				 p=0.048*Math.pow(0.72, y-1974)*M;
			}
					textField_4.setText(String.valueOf(String.format("%.1f",M)));
			        textField_5.setText(String.valueOf(String.format("%.1f",p)));
			        textField_6.setText(String.valueOf(String.format("%.1f",cb)));
		}
		});
		btnNewButton.setBounds(140, 114, 93, 23);
		contentPane.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setBounds(109, 150, 147, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(109, 175, 147, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(109, 200, 147, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
	}
}
