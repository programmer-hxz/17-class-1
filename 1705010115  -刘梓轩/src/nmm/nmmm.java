package nmm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class nmmm {

	JFrame frame;
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
					nmmm window = new nmmm();
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
	public nmmm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 414, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(67, 59, 72, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u8BA1\u7B97");
		button.setBounds(158, 138, 95, 41);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String y=textField.getText();
				String m=textField_1.getText();
				String w=textField_2.getText();
				String zj=textField_3.getText();
				int year = 0;
				double xuqiu=0;
				double jiage=0;
				long g=0;
				double z=0;
				long chengben=0;
				year=Integer.valueOf(y);
				xuqiu= 4080*Math.pow(2.71828, 0.28*(year-1960));
				System.out.println("需求估计为" + xuqiu);
				if(zj.equals("yes"))
				{
					jiage =xuqiu*0.048*Math.pow(0.72,year-1974);
					System.out.println("存储器价格" + jiage );
				}
				else
				{
					jiage =xuqiu*0.3*Math.pow(0.72,year-1974 );
					System.out.println("存储器价格" + xuqiu*0.3*Math.pow(0.72,year-1974 ));
				}
				if(m!=null&&!"".equals(m))
				{
					int mon=Integer.valueOf(m);
					int work=Integer.valueOf(w);
					z=xuqiu/(work*20);
					g=Math.round(z);
					chengben=g*mon;
					System.out.println("成本为" + chengben);
				}
					textField_4.setText(String.valueOf(xuqiu));
					
					textField_5.setText(String.valueOf(jiage));
					
					textField_6.setText(String.valueOf(chengben));
				
				
				
				}

				}
		);
		panel.add(button);
		
		JLabel label = new JLabel("\u95EE\u9898");
		label.setBounds(188, 11, 70, 21);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u8F93\u5165\u5E74\u4EFD");
		label_1.setBounds(10, 62, 54, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\uFF08\u53EF\u9009\uFF09\u5E73\u5747\u5DE5\u8D44\u53CA\u4EE3\u7801\u91CF");
		label_2.setBounds(27, 99, 166, 23);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 100, 54, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(252, 99, 56, 23);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("\u9700\u6C42\u4F30\u8BA1");
		label_4.setFont(new Font("宋体", Font.PLAIN, 19));
		label_4.setBounds(10, 219, 96, 48);
		panel.add(label_4);
		
		JLabel label_3 = new JLabel("\u5B57\u8282\u662F\u5426\u4E3A16\u4F4D");
		label_3.setBounds(170, 58, 123, 29);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(274, 59, 38, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblyesno = new JLabel("*yes\u6216no");
		lblyesno.setBounds(321, 62, 54, 15);
		panel.add(lblyesno);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 235, 206, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C");
		label_5.setFont(new Font("宋体", Font.PLAIN, 19));
		label_5.setBounds(-1, 255, 107, 103);
		panel.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(102, 298, 206, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u6210    \u672C");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 353, 101, 29);
		panel.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(102, 359, 206, 21);
		panel.add(textField_6);
	}
}
