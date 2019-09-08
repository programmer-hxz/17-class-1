package 作业;
import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view extends JFrame {

	private JPanel contentPane;
	private JTextField b;
	private JTextField year;
	private JTextField M;
	private JTextField P1;
	private JTextField gongzi;
	private JTextField C;
	private JTextField zhilin;
	double m;
	double p;
	double c;
	double B;
	double g;
	double y;
	double z;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public view() {
		setTitle("\u4F5C\u4E1A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 306);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5B57\u957F\uFF1A");
		lblNewLabel.setBounds(40, 38, 60, 27);
		contentPane.add(lblNewLabel);
		
		b = new JTextField();
		b.setText("16");
		b.setBounds(97, 41, 72, 21);
		contentPane.add(b);
		b.setColumns(10);
		B=new Double(b.getText()).doubleValue();
		
		JLabel label = new JLabel("\uFF08\u5B57\u6570\uFF09");
		label.setBounds(180, 162, 60, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5E74\u4EFD\uFF1A");
		label_1.setBounds(40, 67, 54, 15);
		contentPane.add(label_1);
		
		year = new JTextField();
		year.setText("1970");
		year.setBounds(97, 64, 72, 21);
		contentPane.add(year);
		year.setColumns(10);
	    y=new Double(year.getText()).doubleValue();
		
		JLabel label_4 = new JLabel("\u6708\u5E73\u5747\u5DE5\u8D44\uFF1A");
		label_4.setBounds(22, 92, 72, 15);
		contentPane.add(label_4);
		
		gongzi = new JTextField();
		gongzi.setText("1000");
		gongzi.setBounds(97, 89, 72, 21);
		contentPane.add(gongzi);
		gongzi.setColumns(10);
		g=new Double(gongzi.getText()).doubleValue();
		
		JLabel label_7 = new JLabel("\u6307\u4EE4\uFF1A");
		label_7.setBounds(218, 44, 54, 15);
		contentPane.add(label_7);
		
		zhilin = new JTextField();
		zhilin.setText("10");
		zhilin.setBounds(259, 41, 66, 21);
		contentPane.add(zhilin);
		zhilin.setColumns(10);
		z=new Double(zhilin.getText()).doubleValue();
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y=new Double(year.getText()).doubleValue();
				g=new Double(gongzi.getText()).doubleValue();
				B=new Double(b.getText()).doubleValue();
				z=new Double(zhilin.getText()).doubleValue();
				 m=function.need(y);
				 p = function.money(y,B);
				 c=function.cost(z,g,y);
				 M.setText(m+"");
				 P1.setText(p+"");
				 C.setText(c+"");
				//调用函数计算
			}
		});
		button.setBounds(64, 120, 93, 23);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("\u50A8\u5B58\u5BB9\u91CF\uFF1A");
		label_2.setBounds(40, 162, 86, 15);
		contentPane.add(label_2);
		
		M = new JTextField();
		M.setBounds(110, 159, 72, 21);
		contentPane.add(M);
		M.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C\uFF1A");
		label_3.setBounds(22, 187, 90, 15);
		contentPane.add(label_3);
		
		P1 = new JTextField();
		P1.setBounds(110, 187, 72, 21);
		contentPane.add(P1);
		P1.setColumns(10);
		
		JLabel label_5 = new JLabel("\u6210\u672C\u4EF7\u683C\uFF1A");
		label_5.setBounds(22, 212, 90, 15);
		contentPane.add(label_5);
		
		C = new JTextField();
		C.setBounds(110, 212, 72, 21);
		contentPane.add(C);
		C.setColumns(10);
		
		JLabel label_6 = new JLabel("\uFF08\u4F4D\uFF09");
		label_6.setBounds(166, 44, 54, 15);
		contentPane.add(label_6);
		
		
	}
}
