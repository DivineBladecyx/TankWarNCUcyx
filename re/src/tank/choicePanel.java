package tank;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class choicePanel extends JPanel{
	JButton[] bt=new JButton[3];
	public static JLabel lb4=new JLabel();
	public static JLabel lb16=new JLabel();
	public static JLabel lb18=new JLabel();
	public choicePanel(){
		
		super();
		
		Font font=new Font("����",Font.PLAIN,20);
		Font font1=new Font("����",Font.PLAIN,30);
		Font font2=new Font("����",Font.PLAIN,40);
		//�ı䲼�ֹ���ʽ
		setLayout(null);
		JLabel lb1=new JLabel("�ѻ�ɱ�з�̹������");
		lb1.setFont(font);
		lb1.setBounds(20,210,200,100);
		add(lb1);
		JLabel lb17=new JLabel("�з�̹��ʣ������");
		lb17.setFont(font);
		lb17.setBounds(20,150,200,100);
		add(lb17);
		lb18.setFont(font);
		lb18.setBounds(20,175,100,100);
		add(lb18);
		lb4.setFont(font);
		lb4.setBounds(20,250,100,100);
		add(lb4);
		JLabel lb2=new JLabel("�ҵ�������");
		lb2.setFont(font);
		lb2.setBounds(20,300,100,100);
		add(lb2);
		JLabel lb5=new JLabel("1");
		lb5.setFont(font);
		lb5.setBounds(20,350,100,100);
		add(lb5);
		JLabel lb3=new JLabel("������ʾ��");
		lb3.setFont(font);
		lb3.setBounds(20,400,100,100);
		add(lb3);
		JLabel lb6=new JLabel("�ϣ�");
		lb6.setFont(font);
		lb6.setBounds(20,430,100,100);
		add(lb6);
		JLabel lb11=new JLabel("С������");
		lb11.setFont(font);
		lb11.setBounds(20,460,100,100);
		add(lb11);
		JLabel lb7=new JLabel("�£�");
		lb7.setFont(font);
		lb7.setBounds(20,490,100,100);
		add(lb7);
		JLabel lb12=new JLabel("С������");
		lb12.setFont(font);
		lb12.setBounds(20,520,100,100);
		add(lb12);
		JLabel lb8=new JLabel("��");
		lb8.setFont(font);
		lb8.setBounds(20,550,100,100);
		add(lb8);
		JLabel lb13=new JLabel("С������");
		lb13.setFont(font);
		lb13.setBounds(20,580,100,100);
		add(lb13);
		JLabel lb9=new JLabel("�ң�");
		lb9.setFont(font);
		lb9.setBounds(20,610,100,100);
		add(lb9);
		JLabel lb14=new JLabel("С������");
		lb14.setFont(font);
		lb14.setBounds(20,640,100,100);
		add(lb14);
		JLabel lb10=new JLabel("�������ո�");
		lb10.setFont(font);
		lb10.setBounds(20,670,100,100);
		add(lb10);
		JLabel lb15=new JLabel("��Ϸʱ�䣺");
		lb15.setFont(font1);
		lb15.setBounds(100,40,200,50);
		add(lb15);
		lb16.setFont(font2);
		lb16.setBounds(130,100,200,50);
		add(lb16);
		lb16.setForeground(Color.red);
		
		setBackground(Color.gray);
		setPreferredSize(new Dimension(300,850)); 
		//setBackground(Color.red);
	}
}
