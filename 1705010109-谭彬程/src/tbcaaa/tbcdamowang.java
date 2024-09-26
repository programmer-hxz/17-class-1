package tbcaaa;
import java.math.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import tbcaaa.*;
public class tbcdamowang {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
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
					tbcdamowang window = new tbcdamowang();
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
	public tbcdamowang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("ËÎÌו", Font.BOLD, 42));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 687, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{138, 114, 126, 0, 0};
		gridBagLayout.rowHeights = new int[]{76, 21, 21, 21, 24, 31, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5E74\u4EFD:");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		
		lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u5B57\u957F:");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		
		lblNewLabel_2 = new JLabel("\u8BF7\u8F93\u5165\u5F00\u53D1\u6307\u4EE4\u6548\u7387:");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")) {
					tbc t1 = new tbc();
					t1.out();
				}else {
					int a,b,c,d;
					double v = 0;
					double s;
					double m;
					a=Integer.valueOf(textField.getText()).intValue();
					b=Integer.valueOf(textField_1.getText()).intValue();
					c=Integer.valueOf(textField_2.getText()).intValue();
					d=Integer.valueOf(textField_3.getText()).intValue();
					s=4080*Math.pow(Math.E, 0.28*(a-1960));
					if(b==8) {
						v=0.024*Math.pow(0.72, a-1974);
					}else if(b==16) {
						v=0.048*Math.pow(0.72, a-1974);
					}
					m=(s/(20*c))*d;
					a=(int) Math.round(s);
					
					b=(int) Math.round(v*s);
					c=(int) Math.round(m);
					textField_4.setText(String.valueOf(a));
					textField_5.setText(String.valueOf(b));
					textField_6.setText(String.valueOf(c));
				}
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		
		lblNewLabel_3 = new JLabel("\u8BF7\u8F93\u5165\u5DE5\u8D44:");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		button.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		button.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.anchor = GridBagConstraints.NORTHEAST;
		gbc_button.gridx = 2;
		gbc_button.gridy = 5;
		frame.getContentPane().add(button, gbc_button);
		
		lblNewLabel_4 = new JLabel("\u8BA1\u7B97\u673A\u5BB9\u91CF\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 6;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 6;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_7 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		frame.getContentPane().add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		lblNewLabel_5 = new JLabel("\u50A8\u5B58\u5668\u4EF7\u683C\uFF1A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 8;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 8;
		frame.getContentPane().add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_8 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 9;
		frame.getContentPane().add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		lblNewLabel_6 = new JLabel("\u7A0B\u5E8F\u5458\u5DE5\u8D44\uFF1A");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 10;
		frame.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 10;
		frame.getContentPane().add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_9 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 11;
		frame.getContentPane().add(lblNewLabel_9, gbc_lblNewLabel_9);
	}
}
