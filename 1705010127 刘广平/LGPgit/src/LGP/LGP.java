package LGP;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import javax.swing.*;
public class LGP{
	public static void main(String[] args) {
		new MyFrame("计算机存储器计算");   }
}
class MyFrame extends Frame implements FocusListener{
	private static final long serialVersionUID = 1L; 
	private TextArea ta,t1,t2;
	String c;
   
	public MyFrame(String title){	
		super(title);
		SetTextAreas();		
		SetButtonArea();		
		SetMainFram();
	}

	private void SetButtonArea() {
		addButton("7",44,38,50,208);		
		addButton("8",44,38,108,208);		
		addButton("9",44,38,166,208);
		addButton("4",44,38,50,260);		 
		addButton("5",44,38,108,260);		
		addButton("6",44,38,166,260);
		addButton("1",44,38,50,312);		
		addButton("2",44,38,108,312);	
		addButton("3",44,38,166,312);
		addButton("=",44,38,50,364);
		addButton("0",44,38,108,364);
		addButton("<-",44,38,166,364);
	}
	double m,n;	
	String  k;	
	boolean flag =true;	
	boolean flag2 =false;	
	private void addButton(String string, int i, int j,int x,int y) {	
		final Button b = new Button(string);
		b.setLocation(x, y);	
		b.setSize(i, j);	
		b.setFont(new Font("标楷体", Font.BOLD, 15));		
		b.setBackground(Color.lightGray); 	
		b.setForeground(Color.darkGray); 
		b.addMouseListener(new MouseAdapter() {	
			@Override	
			public void mousePressed(MouseEvent e) {				
				counts();		
			}
public void counts() {
	if(!b.getActionCommand().equals("=")) {
	if(t1.isFocusOwner()==true) {
		t1.append(b.getActionCommand());
		}
	else
	    t2.append(b.getActionCommand());}
	
	
	
	k=b.getActionCommand();
	if(c.equals("存储量需求")&&k=="="){
		m = new Double(t1.getText()).doubleValue();
		n = new Double(t2.getText()).doubleValue();
		t1.setText("0");
		t2.setText("0");
		double e=Math.pow(Math.E, 0.28*(n-1960));
		double mn=4080*e;
		ta.setText("存储量的需求为："+mn);	
	}
	if(c.equals("存储器价格")&&k=="=") {
		m = new Double(t1.getText()).doubleValue();
		n = new Double(t2.getText()).doubleValue();
		t1.setText("0");
		t2.setText("0");
		double e=Math.pow(0.72, n-1974);
		double mn=0.3*m*0.01*e*4080*Math.pow(Math.E, 0.28*(n-1960));
		ta.setText("存储器的价格为："+mn);
	}
	if(c.equals("存储器所需成本")&&k=="=") {
		m = new Double(t1.getText()).doubleValue();
		n = new Double(t2.getText()).doubleValue();
		t1.setText("0");
		t2.setText("0");
		double e=(4080*Math.pow(Math.E, 0.28*(n-1960)))/200;
		double mn=e*4000;
		ta.setText("存储器所需成本为(4000d/月&10指令/天)："+mn);
	}
	if(k=="<-"){
        if(t1.isFocusOwner()==true)
		{
			t1.setText("0");
			}
		else t2.setText("0");
}
	}
});
		this.add(b);
		}
			public void SetTextAreas() {
				ta = new TextArea("0",8,50,3);
				ta.setBackground(Color.lightGray);		
				ta.setSize(250, 50);		
				ta.setFont(new Font("标楷体", Font.BOLD, 15));
				this.add(ta);	
				ta.setLocation(20,60);		
					
				JLabel Word_length= new JLabel("计算机字长：");
				Word_length.setForeground(Color.red);
				Word_length.setBounds(20,120,80,20);
				
				t1=new TextArea("0",8,50,3);
				t1.setBackground(Color.pink); 
				t1.setSize(100,20);
				t1.setFont(new Font("标楷体", Font.BOLD, 16));
				t1.setForeground(Color.blue);	
				t1.setLocation(100,120);	
				t1.addFocusListener(this);
				add(Word_length);
				add(t1);
				
				JLabel Year= new JLabel("所要求年份：");
				Year.setForeground(Color.red);
				Year.setBounds(20,140,80,20);
				
				t2=new TextArea("0",8,50,3);
				t2.setBackground(Color.pink); 
				t2.setSize(100,20);
				t2.setFont(new Font("标楷体", Font.BOLD, 16));
				t2.setForeground(Color.blue);	
				t2.setLocation(100,140);	
				t2.addFocusListener(this);
				add(Year);
				add(t2);
				
				JLabel jLChoices = new JLabel("选择计算项目：");
				jLChoices.setForeground(Color.red);
				//String Choice="存储量需求";
				JComboBox<String>  jCBChoices=new JComboBox<String>();
				jCBChoices.addItem("存储量需求");
				jCBChoices.addItem("存储器价格");
				jCBChoices.addItem("存储器所需成本");
				//jCBChoices.setBackground(Color.pink);
				add(jLChoices);
				add(jCBChoices);
				jLChoices.setBounds(20,160,100,20);
				jCBChoices.setBounds(120,160,120,20);
				
				jCBChoices.addItemListener(new ItemListener() {// 下拉框事件监听
					public void itemStateChanged(ItemEvent event) {
						switch (event.getStateChange()) {
						case ItemEvent.SELECTED:
							String Choice = (String) event.getItem();
							System.out.println("选中：" + Choice);
							break;
						case ItemEvent.DESELECTED:
							System.out.println("取消选中：" + event.getItem());
							break;
						}
						c=(String)event.getItem();
					}
				});
			}
			
	private void SetMainFram() {
		this.setLayout(null);	
		this.setSize(290,470);
		this.setVisible(true);		
		this.setLocation(110, 100);		
		this.setResizable(false); //不可调节大小	
		ta.setEditable(false);    //不可编辑
		this.setCursor(Cursor.HAND_CURSOR);		
		this.addWindowListener(new WindowAdapter() {			
			public void windowClosing(WindowEvent e) {				
				System.exit(0);			
				}		
			});						
		}
	
	public void focusGained(FocusEvent e) {
		TextArea text=(TextArea)e.getSource();
		if(text==t1) {
	    //t1.setText("选中此文本框");
		t1.setBackground(Color.gray);
		}
		if(text==t2) {
		//t2.setText("选中此文本框");
		t2.setBackground(Color.gray);
		}
		}
	public void focusLost(FocusEvent e) {
		TextArea text=(TextArea)e.getSource();
		if(text==t1) {
		t1.setBackground(Color.pink);
		}
		if(text==t2) {
		t2.setBackground(Color.pink);
		}
		}
	}