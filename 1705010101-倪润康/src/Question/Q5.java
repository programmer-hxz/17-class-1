package Question;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Q5 extends JFrame
{
	int word_num = 16;
	
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	JPanel jp4;
	JPanel jp5;
	JPanel jp6;
	
    private JLabel label1_1;
    private JLabel label1_2;
    private JLabel label1_3;
    private JLabel label1_4;
    private JLabel label1_5;
    private JLabel label1_6;
    private JLabel label1_7;
    
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    
    private JLabel label2;
    
    private JLabel label3_1;
    private JLabel label3_2;
    private JLabel label3_3;
    private JLabel label3_4;
    private JLabel label3_5;
    private JLabel label3_6;

    private JRadioButton jrb1,jrb2; //��ѡ��
    private ButtonGroup bg;

    public Q5()
    {
    	jp2 = new JPanel(); //���2���ֳ�ѡ��
    	add(jp2);
    	
    	label2=new JLabel("ѡ���ֳ�"); //ѡ���ֳ�
        jp2.add(label2);
        
        jrb1 = new JRadioButton("16λ",true); //��ѡ��
        jrb2 = new JRadioButton("32λ");
        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jp2.add(jrb1);
        jp2.add(jrb2);
        
        
        /*****************************************************************/
        
        jp3 = new JPanel(); //���3������������ƣ�
    	add(jp3);
        
    	label1_1 = new JLabel("��");
    	label1_2 = new JLabel("��Լ�����洢���������������");
    	label1_3 = new JLabel("        �֣�");
    	
    	textField1=new JTextField(5);
    	
    	jp3.add(label1_1);
    	jp3.add(textField1);
    	jp3.add(label1_2);
    	jp3.add(label1_3);
    
        /*****************************************************************/
        
    	jp1 = new JPanel(); //���1���洢���۸���㣩
    	add(jp1);

    	label1_4 = new JLabel("            ����ֳ�Ϊ");
    	label1_5 = new JLabel("16λ��");
    	label1_6 = new JLabel("����洢���ļ۸���");
    	label1_7 = new JLabel("        ��Ԫ��            ");



        jp1.add(label1_4);
        jp1.add(label1_5);
        jp1.add(label1_6);
        jp1.add(label1_7);

        /*****************************************************************/
        
        jp5 = new JPanel(); //���5��6�������˹��ɱ���
        jp6 = new JPanel();
        add(jp5);
        add(jp6);
        
        label3_1 = new JLabel("����ÿ������Աÿ��ɿ�����");
        textField2=new JTextField(3);
        label3_2 = new JLabel("��ָ�");
        label3_3 = new JLabel("����Ա��ƽ��������ÿ��");
        textField3=new JTextField(5);
        label3_4 = new JLabel("��Ԫ��");
        
        
        jp5.add(label3_1);
        jp5.add(textField2);
        jp5.add(label3_2);
        jp5.add(label3_3);
        jp5.add(textField3);
        jp5.add(label3_4);
        
        label3_5 = new JLabel("                                   ��ʹ�洢��װ�����������õĳɱ���");
        label3_6 = new JLabel("              ��Ԫ��                                   ");
        
        jp6.add(label3_5);
        jp6.add(label3_6);
        
        /*****************************************************************/
        
        jp4 = new JPanel(); //���4����ť��
        add(jp4);
        button1= new JButton("����");
        button2= new JButton("����");
        jp4.add(button1);
        jp4.add(button2);
        
        /*****************************************************************/
        
        button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//������������
				long sum1 = 0;
	        	sum1 = (long) (4080 * Math.pow(Math.E,0.28 * (Integer.parseInt(textField1.getText()) - 1960)));
	        	label1_3.setText(new Long(sum1).toString() + "�֣�");
	        	
	        	//����洢���۸�
	        	long sum2 = 0;
	        	sum2 = (long) (0.003 * word_num * Math.pow(0.72, (Integer.parseInt(textField1.getText()) - 1974)) * sum1);
	        	label1_7.setText(new Long(sum2).toString() + "��Ԫ��");
	        	
	        	//�����˹��ɱ�
	        	if(Integer.parseInt(textField2.getText()) >= 0 && Integer.parseInt(textField3.getText()) >= 0){
		        	long sum3 = 0;
		        	sum3 = (sum1 / (Integer.parseInt(textField2.getText()) * 30)) * Integer.parseInt(textField3.getText());
		        	label3_6.setText(new Long(sum3).toString() + "��Ԫ��                                   ");
	        	}
			}
        });
        button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//����
				word_num = 16;
				label1_3.setText("        �֣�");
				label1_7.setText("        ��Ԫ��");
				textField1.setText("");
				jrb1.setSelected(true);
				jrb2.setSelected(false);
				textField2.setText("");
				textField3.setText("");
				label3_6.setText("              ��Ԫ��                                   ");
			}
        });
        jrb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ѡ��16λ
				label1_5.setText(jrb1.getText() + "��");
				word_num = 16;
			}
        });
        
        jrb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ѡ��32λ
				label1_5.setText(jrb2.getText() + "��");
				word_num = 32;
			}
        });
        
        /*****************************************************************/
        
        //��ʽ�Ű�
        setLayout(new FlowLayout());
        
    }

    public static void main(String args[])
    {

        Q5 window=new Q5();
        window.setTitle("ϰ��1-5");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(600,300);
        window.setVisible(true);
       // window.pack();
    }

}
