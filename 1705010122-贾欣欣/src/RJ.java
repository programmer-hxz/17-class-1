package jxx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RJ {

	private JFrame frame;
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
					RJ window = new RJ();
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
	public RJ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("����۸����");
		frame.setBounds(100, 100, 801, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblm = new JLabel("�洢�����������ƣ�M=4080e^0.28(Y-1960)");
		lblm.setFont(new Font("����", Font.BOLD, 20));
		lblm.setBounds(34, 48, 553, 34);
		frame.getContentPane().add(lblm);
		
		JLabel lblpy = new JLabel("�洢���۸��½����ƣ�P1=0.3*0.72^(Y-1974) (����/λ)");
		lblpy.setFont(new Font("����", Font.BOLD, 20));
		lblpy.setBounds(34, 95, 684, 40);
		frame.getContentPane().add(lblpy);
		
		JLabel lblpy_1 = new JLabel("������ֳ�16λ�Ĵ洢���۸��½����ƣ�P2=0.048*0.72^(Y-1974) (��Ԫ/��)");
		lblpy_1.setFont(new Font("����", Font.BOLD, 20));
		lblpy_1.setBounds(34, 148, 735, 34);
		frame.getContentPane().add(lblpy_1);
		
		JLabel label = new JLabel("��������ݣ�");
		label.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label.setBounds(50, 220, 108, 24);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("�ɿ���ָ�");
		label_1.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_1.setBounds(419, 220, 108, 24);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("ƽ�����ʣ�");
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		lblNewLabel.setBounds(55, 270, 108, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("�洢���ֳ���");
		label_2.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_2.setBounds(419, 270, 108, 24);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(160, 222, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(522, 222, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 272, 86, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(522, 272, 86, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double y=Double.parseDouble(textField.getText());
				double zl=Double.parseDouble(textField_1.getText());
				double gz=Double.parseDouble(textField_2.getText());
				double zc=Double.parseDouble(textField_3.getText());
			double m=4080*Math.pow(Math.E, 0.28*(y-1960));
			double p=0.003*zc*Math.pow(0.72, y-1974)*m;
			double cb=(m/(zl*20))*gz;
			textField_4.setText(String.valueOf( String.format("%.1f", m)));
			textField_5.setText(String.valueOf(String.format("%.1f", cb)));
			textField_6.setText(String.valueOf(String.format("%.1f", p)));
			}
		});
		button.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		button.setBounds(284, 309, 108, 27);
		frame.getContentPane().add(button);
		
		JLabel label_3 = new JLabel("����������");
		label_3.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_3.setBounds(50, 355, 108, 24);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("�������۸�");
		label_4.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_4.setBounds(540, 355, 108, 24);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("����ɱ�");
		label_5.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_5.setBounds(294, 355, 86, 24);
		frame.getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(29, 392, 128, 24);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(281, 392, 128, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(522, 392, 128, 24);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_6 = new JLabel("��");
		label_6.setFont(new Font("����", Font.PLAIN, 18));
		label_6.setBounds(253, 225, 86, 18);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("��/��");
		label_7.setFont(new Font("����", Font.PLAIN, 18));
		label_7.setBounds(618, 224, 86, 18);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("��Ԫ/��");
		label_8.setFont(new Font("����", Font.PLAIN, 18));
		label_8.setBounds(253, 274, 86, 18);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("λ");
		label_9.setFont(new Font("����", Font.PLAIN, 18));
		label_9.setBounds(618, 276, 86, 18);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("��");
		label_10.setFont(new Font("����", Font.PLAIN, 18));
		label_10.setBounds(171, 395, 72, 18);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("��Ԫ");
		label_11.setFont(new Font("����", Font.PLAIN, 18));
		label_11.setBounds(419, 395, 72, 18);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("��Ԫ");
		label_12.setFont(new Font("����", Font.PLAIN, 18));
		label_12.setBounds(664, 395, 72, 18);
		frame.getContentPane().add(label_12);
	}
}
