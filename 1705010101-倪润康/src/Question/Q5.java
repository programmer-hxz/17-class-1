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

    private JRadioButton jrb1,jrb2; //单选框
    private ButtonGroup bg;

    public Q5()
    {
    	jp2 = new JPanel(); //面板2（字长选择）
    	add(jp2);
    	
    	label2=new JLabel("选择字长"); //选择字长
        jp2.add(label2);
        
        jrb1 = new JRadioButton("16位",true); //单选框
        jrb2 = new JRadioButton("32位");
        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jp2.add(jrb1);
        jp2.add(jrb2);
        
        
        /*****************************************************************/
        
        jp3 = new JPanel(); //面板3（容量需求估计）
    	add(jp3);
        
    	label1_1 = new JLabel("在");
    	label1_2 = new JLabel("年对计算机存储容量的需求估计是");
    	label1_3 = new JLabel("        字，");
    	
    	textField1=new JTextField(5);
    	
    	jp3.add(label1_1);
    	jp3.add(textField1);
    	jp3.add(label1_2);
    	jp3.add(label1_3);
    
        /*****************************************************************/
        
    	jp1 = new JPanel(); //面板1（存储器价格计算）
    	add(jp1);

    	label1_4 = new JLabel("            如果字长为");
    	label1_5 = new JLabel("16位，");
    	label1_6 = new JLabel("这个存储器的价格是");
    	label1_7 = new JLabel("        美元。            ");



        jp1.add(label1_4);
        jp1.add(label1_5);
        jp1.add(label1_6);
        jp1.add(label1_7);

        /*****************************************************************/
        
        jp5 = new JPanel(); //面板5、6（计算人工成本）
        jp6 = new JPanel();
        add(jp5);
        add(jp6);
        
        label3_1 = new JLabel("今年每名程序员每天可开发出");
        textField2=new JTextField(3);
        label3_2 = new JLabel("条指令，");
        label3_3 = new JLabel("程序员的平均工资是每月");
        textField3=new JTextField(5);
        label3_4 = new JLabel("美元，");
        
        
        jp5.add(label3_1);
        jp5.add(textField2);
        jp5.add(label3_2);
        jp5.add(label3_3);
        jp5.add(textField3);
        jp5.add(label3_4);
        
        label3_5 = new JLabel("                                   则使存储器装满程序所需用的成本是");
        label3_6 = new JLabel("              美元。                                   ");
        
        jp6.add(label3_5);
        jp6.add(label3_6);
        
        /*****************************************************************/
        
        jp4 = new JPanel(); //面板4（按钮）
        add(jp4);
        button1= new JButton("计算");
        button2= new JButton("重置");
        jp4.add(button1);
        jp4.add(button2);
        
        /*****************************************************************/
        
        button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//计算容量需求
				long sum1 = 0;
	        	sum1 = (long) (4080 * Math.pow(Math.E,0.28 * (Integer.parseInt(textField1.getText()) - 1960)));
	        	label1_3.setText(new Long(sum1).toString() + "字，");
	        	
	        	//计算存储器价格
	        	long sum2 = 0;
	        	sum2 = (long) (0.003 * word_num * Math.pow(0.72, (Integer.parseInt(textField1.getText()) - 1974)) * sum1);
	        	label1_7.setText(new Long(sum2).toString() + "美元。");
	        	
	        	//计算人工成本
	        	if(Integer.parseInt(textField2.getText()) >= 0 && Integer.parseInt(textField3.getText()) >= 0){
		        	long sum3 = 0;
		        	sum3 = (sum1 / (Integer.parseInt(textField2.getText()) * 30)) * Integer.parseInt(textField3.getText());
		        	label3_6.setText(new Long(sum3).toString() + "美元。                                   ");
	        	}
			}
        });
        button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重置
				word_num = 16;
				label1_3.setText("        字，");
				label1_7.setText("        美元。");
				textField1.setText("");
				jrb1.setSelected(true);
				jrb2.setSelected(false);
				textField2.setText("");
				textField3.setText("");
				label3_6.setText("              美元。                                   ");
			}
        });
        jrb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//选择16位
				label1_5.setText(jrb1.getText() + "，");
				word_num = 16;
			}
        });
        
        jrb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//选择32位
				label1_5.setText(jrb2.getText() + "，");
				word_num = 32;
			}
        });
        
        /*****************************************************************/
        
        //流式排版
        setLayout(new FlowLayout());
        
    }

    public static void main(String args[])
    {

        Q5 window=new Q5();
        window.setTitle("习题1-5");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setSize(600,300);
        window.setVisible(true);
       // window.pack();
    }

}
