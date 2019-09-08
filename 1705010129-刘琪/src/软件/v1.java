package 软件;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;

public class v1 {
	double P = 0, M = 0, Cost = 0;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JButton button;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel label_9;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 window = new v1();
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
	public v1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u9996\u9875");
		frame.setBounds(100, 100, 663, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u76F8\u5173\u4FE1\u606F\u8F93\u5165");
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(55, 32, 129, 26);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u5E74\u4EFD:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(63, 70, 53, 26);
		frame.getContentPane().add(label_1);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(126, 75, 72, 21);
		frame.getContentPane().add(textField);

		JLabel label_3 = new JLabel("\u6307\u4EE4\u6570/\u5929\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(17, 106, 99, 26);
		frame.getContentPane().add(label_3);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(126, 106, 72, 21);
		frame.getContentPane().add(textField_2);

		button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Time = textField.getText();
				String InstructionsNum = textField_2.getText();
				String Money = textField_1.getText();
				String Wordlength = textField_3.getText();
				String day = textField_7.getText();
				int T = Integer.parseInt(Time);
				int Num = Integer.parseInt(InstructionsNum);
				int salary = Integer.parseInt(Money);
				int WL = Integer.parseInt(Wordlength);
				int Day = Integer.parseInt(day);
				int Y1 = T - 1974;
				int Y2 = T - 1960;

				double x = 0.28 * Y2;

				double y = Math.pow(0.72, Y1);

				double e1 = Math.E;
				double m = Math.pow(e1, x);
				M = 4080 * m;
				P = 0.3 * y * WL * M*0.01;
				int z=Num * Day;
				double  Cost1 = M / z;
				int C=(int)Cost1;
				Cost = C * salary;
				int a=(int)M;
				int b=(int)P;
				int c=(int)Cost;
				String fromDouble = String.valueOf(a);
				textField_4.setText(fromDouble);
				String fromDouble1 = String.valueOf(b);
				textField_5.setText(fromDouble1);
				String fromDouble2 = String.valueOf(c);
				textField_6.setText(fromDouble2);

			}

		});

		button.setBounds(203, 295, 72, 23);
		frame.getContentPane().add(button);

		JLabel label_2 = new JLabel("\u5DE5\u8D44/\u6708\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(35, 137, 81, 26);
		frame.getContentPane().add(label_2);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(126, 142, 72, 21);
		frame.getContentPane().add(textField_1);

		JLabel label_4 = new JLabel("\u9700\u6C42\u4F30\u8BA1:");
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(387, 70, 99, 26);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C:");
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(370, 106, 116, 26);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("\u8BA1\u7B97\u673A\u5B57\u957F:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(0, 168, 116, 26);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("\u5B58\u50A8\u5668\u88C5\u6EE1\u7A0B\u5E8F\u6240\u9700\u6210\u672C:");
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(264, 137, 222, 26);
		frame.getContentPane().add(label_7);

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(126, 173, 72, 21);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(496, 75, 129, 21);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();

		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(496, 111, 129, 21);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();

		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(496, 142, 129, 21);
		frame.getContentPane().add(textField_6);

		JLabel label_8 = new JLabel("\u76F8\u5173\u7ED3\u679C\u8F93\u51FA");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLUE);
		label_8.setFont(new Font("宋体", Font.PLAIN, 20));
		label_8.setBounds(412, 32, 129, 26);
		frame.getContentPane().add(label_8);

		label_9 = new JLabel("\u6BCF\u6708\u5DE5\u4F5C\u65E5\uFF1A");
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(8, 206, 108, 26);
		frame.getContentPane().add(label_9);

		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(126, 211, 72, 21);
		frame.getContentPane().add(textField_7);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_2.setText(null);
				textField_1.setText(null);
				textField_3.setText(null);
				textField_7.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
			}
		});
		button_1.setBounds(353, 295, 72, 23);
		frame.getContentPane().add(button_1);

	}
}