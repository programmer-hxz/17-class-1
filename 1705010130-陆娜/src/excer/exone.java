package excer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class exone {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JLabel lblNewLabel_3;
	private JLabel label_1;
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
					exone window = new exone();
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
	public exone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 13));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 403, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("  \u8F6F\u4EF6\u5DE5\u7A0B\u5BFC\u8BBA\u4E60\u9898\u4E00\u7B2C5\u9898");
		label.setFont(new Font("宋体", Font.PLAIN, 21));
		label.setForeground(SystemColor.inactiveCaptionText);
		label.setBounds(38, 20, 283, 38);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5E74\u4EFD");
		lblNewLabel.setBounds(38, 68, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();//输入年份
		textField.setBounds(102, 68, 84, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		

		
		JLabel lblNewLabel_2 = new JLabel("\u5982\u679C\u5B57\u957F\u4E3A16\u4F4D\uFF0C\u8FD9\u4E2A\u5B58\u50A8\u5668\u7684\u4EF7\u683C\u662F");
		lblNewLabel_2.setBounds(31, 130, 243, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("(1)1985\u5E74\u5BF9\u8BA1\u7B97\u673A\u5B58\u50A8\u5BB9\u91CF\u7684\u9700\u6C42\u4F30\u8BA1\u662F");
		lblNewLabel_1.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_1.setBounds(21, 105, 253, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();//计算机存储容量的需求估计
		textField_1.setBounds(269, 105, 95, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();//存储器价格
		textField_2.setBounds(269, 130, 95, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		textField_3 = new JTextField();//装满程序所用的成本
		textField_3.setBackground(SystemColor.textHighlightText);
		textField_3.setBounds(186, 219, 94, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.inactiveCaption);
		textPane.setText("(2)\u5047\u8BBE\u57281985\u5E74\u4E00\u540D\u7A0B\u5E8F\u5458\u6BCF\u5929\u53EF\u5F00\u53D1\u51FA10\u6761\u6307\u4EE4\uFF0C\u7A0B\u5E8F\u5458\u7684\u5E73\u5747\u5DE5\u8D44\u662F\u6BCF\u67084000\u7F8E\u5143\u3002\u5982\u679C\u4E00\u6761\u6307\u4EE4\u4E3A\u4E00\u4E2A\u5B57\u957F\uFF0C\u4F7F\u5B58\u50A8\u5668\u88C5\u6EE1\u7A0B\u5E8F\u6240\u9700\u7528\u7684\u6210\u672C");
		textPane.setBounds(21, 181, 338, 59);
		frame.getContentPane().add(textPane);
		
		
		lblNewLabel_3 = new JLabel("\u91CD\u590D(1)");
		lblNewLabel_3.setBounds(61, 309, 54, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		label_1 = new JLabel("\u91CD\u590D(2)");
		label_1.setBounds(61, 337, 54, 15);
		frame.getContentPane().add(label_1);
		
		textField_4 = new JTextField();//1995存储容量需求估计
		textField_4.setBounds(125, 306, 102, 21);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();//成本
		textField_5.setBounds(125, 334, 102, 21);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();//1995这个存储器的价格
		textField_6.setBounds(255, 306, 94, 21);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textPane_2 = new JTextPane();
		textPane_2.setText("(3)\u5047\u8BBE\u57281995\u5E74\u5B58\u50A8\u5668\u5B57\u957F\u4E3A32\u4F4D\uFF0C\u4E00\u540D\u7A0B\u5E8F\u5458\u6BCF\u5929\u53EF\u53D1\u51FA30\u6761\u6307\u4EE4\uFF0C\u7A0B\u5E8F\u5458\u7684\u6708\u5E73\u5747\u5DE5\u8D44\u4E3A6000\u7F8E\u5143");
		textPane_2.setBackground(SystemColor.inactiveCaption);
		textPane_2.setBounds(21, 260, 338, 107);
		frame.getContentPane().add(textPane_2);
		
		JButton btnNewButton = new JButton("\u786E   \u8BA4");//输入年份的确认按钮
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(211, 68, 77, 23);
		frame.getContentPane().add(btnNewButton);
		

	
		

	}
}
