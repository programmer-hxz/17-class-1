




















1.eclipse java

2.windows

3.��ͨ�ļ���

4.Դ�� Test01
import java.awt.Dimension;//���ܸ߶ȿ��
import java.awt.Toolkit;//������
import java.awt.event.ActionEvent;//�����¼�
import java.awt.event.ActionListener;//������

import javax.swing.JButton;//��ť
import javax.swing.JFrame;//��������
import javax.swing.JLabel;//��ǩ���
import javax.swing.JTextField;//��������
public class Test01 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("���� ");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 100) / 2, ((int)dimension.getHeight() - 100) / 2, 300, 350);
		jFrame.setResizable(true);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ر�
		
		JLabel label1 = new JLabel("�������");
		label1.setBounds(10, 10, 100, 30);
		jFrame.add(label1);
		 
		JLabel label2 = new JLabel("�����ֳ�");
		label2.setBounds(10, 40, 100, 30);
		jFrame.add(label2);
		
		JLabel label3 = new JLabel("������н");
		label3.setBounds(10, 70, 100, 30);
		jFrame.add(label3);
		
		JLabel label4 = new JLabel("ָ������");
		label4.setBounds(10, 100, 100, 30);
		jFrame.add(label4);
		
		JLabel label5 = new JLabel("����۸�");
		label5.setBounds(10, 130, 100, 30);
		jFrame.add(label5);
		
		JLabel label6 = new JLabel("����ɱ�");
		label6.setBounds(10, 160, 100, 30);
		jFrame.add(label6);
		
		final JTextField text1 = new JTextField();
		text1.setBounds(70, 15, 130, 20);
		jFrame.add(text1);
		
		final JTextField text2 = new JTextField();
		text2.setBounds(70, 45, 130, 20);
		jFrame.add(text2);
		
		final JTextField text3 = new JTextField();
		text3.setBounds(70, 75, 130, 20);
		jFrame.add(text3);
		
		final JTextField text4 = new JTextField();
		text4.setBounds(70, 105, 130, 20);
		jFrame.add(text4);
		
		final JTextField text5 = new JTextField();
		text5.setBounds(70, 135, 80, 20);
		jFrame.add(text5);
		
		final JTextField text6 = new JTextField();
		text6.setBounds(70, 165, 80, 20);
		jFrame.add(text6);
		
		JButton button1 = new JButton("�۸�");
		button1.setBounds(10, 195, 70, 40);
		JButton button2 = new JButton("�ɱ�");
		button2.setBounds(100, 195, 70, 40);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				   
				  int a= Integer.parseInt(text1.getText());
			
				   int b= Integer.parseInt(text2.getText());
				int M=(int)(4080*Math.pow(Math.E,0.28*(a-1960)));
				int price=(int)(0.003*b*Math.pow(0.72,(a-1974))*M);
				 text5.setText(price+"");
				}
			
		});
button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent q) {
				
				  int a= Integer.parseInt(text1.getText());

				int M=(int)(4080*Math.pow(Math.E,0.28*(a-1960)));
				 int b=(int)(M/200);
				int cb=(int)(b*4000);
				 text6.setText(cb +"");
				}
			
		});
		jFrame.add(button1);
		jFrame.add(button2);
		jFrame.setVisible(true);//���ڿɼ�
	}

}