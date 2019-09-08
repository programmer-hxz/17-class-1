package computer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class main extends JFrame {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int year;
	public double work;
	public double mon;
	public int len;
	private JPanel contentPane;
	private JTextField Y;
	private JTextField W;
	private JTextField M;
	private JTextField L;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setTitle("\u8BA1\u7B97");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Y = new JTextField();
		Y.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("年份Y:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 21));
		
		JLabel lblNewLabel_1 = new JLabel("程序员每日工作量W：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 21));
		
		JLabel lblNewLabel_2 = new JLabel("程序员每月工资M:");
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 21));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("计算机字长L：");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("楷体", Font.PLAIN, 21));
		
		W = new JTextField();
		W.setColumns(10);
		
		M = new JTextField();
		M.setColumns(10);
		
		L = new JTextField();
		L.setColumns(10);
		
		JButton btnNewButton = new JButton("计算存储容量");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year=Integer.parseInt(Y.getText());
				A.rong=4080*Math.exp(0.28*(year-1960));
				A.flag=1;
				new zhi();
				zhi.Zhi();
			}
		});
		
		JButton btnNewButton_1 = new JButton("计算计算机价格");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year=Integer.parseInt(Y.getText());
				len=Integer.parseInt(L.getText());
				A.rong=4080*Math.exp(0.28*(year-1960));
				if(len==16)
				{
				A.money=0.048*Math.pow(0.72, year-1974)*A.rong;
				}
				else
				{
					A.money=0.003*32*Math.pow(0.72, year-1974)*A.rong;
				}
				A.flag=2;
				new zhi();
				zhi.Zhi();
			}
		});
		
		JButton btnNewButton_2 = new JButton("计算成本");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year=Integer.parseInt(Y.getText());
				work=Double.parseDouble(W.getText());
				mon=Double.parseDouble(M.getText());
				A.rong=(4080*Math.exp(0.28*(year-1960)))/(work*30);
				A.cheng=A.rong*mon;
				A.flag=3;
				new zhi();
				zhi.Zhi();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(57))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(88))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(80))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addGap(96)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(M, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(W, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(L, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(Y, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(182))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addComponent(btnNewButton)
					.addGap(56)
					.addComponent(btnNewButton_1)
					.addGap(71)
					.addComponent(btnNewButton_2)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Y, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(W, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(M, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(L, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(75))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
