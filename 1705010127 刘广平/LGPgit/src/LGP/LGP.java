package LGP;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import javax.swing.*;
public class LGP{
	public static void main(String[] args) {
		new MyFrame("������洢������");   }
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
		b.setFont(new Font("�꿬��", Font.BOLD, 15));		
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
	if(c.equals("�洢������")&&k=="="){
		m = new Double(t1.getText()).doubleValue();
		n = new Double(t2.getText()).doubleValue();
		t1.setText("0");
		t2.setText("0");
		double e=Math.pow(Math.E, 0.28*(n-1960));
		double mn=4080*e;
		ta.setText("�洢��������Ϊ��"+mn);	
	}
	if(c.equals("�洢���۸�")&&k=="=") {
		m = new Double(t1.getText()).doubleValue();
		n = new Double(t2.getText()).doubleValue();
		t1.setText("0");
		t2.setText("0");
		double e=Math.pow(0.72, n-1974);
		double mn=0.3*m*0.01*e*4080*Math.pow(Math.E, 0.28*(n-1960));
		ta.setText("�洢���ļ۸�Ϊ��"+mn);
	}
	if(c.equals("�洢������ɱ�")&&k=="=") {
		m = new Double(t1.getText()).doubleValue();
		n = new Double(t2.getText()).doubleValue();
		t1.setText("0");
		t2.setText("0");
		double e=(4080*Math.pow(Math.E, 0.28*(n-1960)))/200;
		double mn=e*4000;
		ta.setText("�洢������ɱ�Ϊ(4000d/��&10ָ��/��)��"+mn);
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
				ta.setFont(new Font("�꿬��", Font.BOLD, 15));
				this.add(ta);	
				ta.setLocation(20,60);		
					
				JLabel Word_length= new JLabel("������ֳ���");
				Word_length.setForeground(Color.red);
				Word_length.setBounds(20,120,80,20);
				
				t1=new TextArea("0",8,50,3);
				t1.setBackground(Color.pink); 
				t1.setSize(100,20);
				t1.setFont(new Font("�꿬��", Font.BOLD, 16));
				t1.setForeground(Color.blue);	
				t1.setLocation(100,120);	
				t1.addFocusListener(this);
				add(Word_length);
				add(t1);
				
				JLabel Year= new JLabel("��Ҫ����ݣ�");
				Year.setForeground(Color.red);
				Year.setBounds(20,140,80,20);
				
				t2=new TextArea("0",8,50,3);
				t2.setBackground(Color.pink); 
				t2.setSize(100,20);
				t2.setFont(new Font("�꿬��", Font.BOLD, 16));
				t2.setForeground(Color.blue);	
				t2.setLocation(100,140);	
				t2.addFocusListener(this);
				add(Year);
				add(t2);
				
				JLabel jLChoices = new JLabel("ѡ�������Ŀ��");
				jLChoices.setForeground(Color.red);
				//String Choice="�洢������";
				JComboBox<String>  jCBChoices=new JComboBox<String>();
				jCBChoices.addItem("�洢������");
				jCBChoices.addItem("�洢���۸�");
				jCBChoices.addItem("�洢������ɱ�");
				//jCBChoices.setBackground(Color.pink);
				add(jLChoices);
				add(jCBChoices);
				jLChoices.setBounds(20,160,100,20);
				jCBChoices.setBounds(120,160,120,20);
				
				jCBChoices.addItemListener(new ItemListener() {// �������¼�����
					public void itemStateChanged(ItemEvent event) {
						switch (event.getStateChange()) {
						case ItemEvent.SELECTED:
							String Choice = (String) event.getItem();
							System.out.println("ѡ�У�" + Choice);
							break;
						case ItemEvent.DESELECTED:
							System.out.println("ȡ��ѡ�У�" + event.getItem());
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
		this.setResizable(false); //���ɵ��ڴ�С	
		ta.setEditable(false);    //���ɱ༭
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
	    //t1.setText("ѡ�д��ı���");
		t1.setBackground(Color.gray);
		}
		if(text==t2) {
		//t2.setText("ѡ�д��ı���");
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