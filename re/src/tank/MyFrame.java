package tank;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame{
	
	ImageIcon icon;
	private MyPanel panel;
	static test A=null;
	public MyFrame(){
		init();
	}
	private void init() {
		
		panel=new MyPanel();           
		this.add(panel);
		//ע�����
		this.addKeyListener(panel);
		//��������
		this.setFocusable(true);
		this.pack();
		this.setTitle("̹�˴�ս");
		this.setSize(1000,1000);
		//����ر�ʱ������ֹ
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//this.setLocationRelativeTo(null);
        //���ò��ܸı䴰��Ĵ�С
		this.setResizable(false);
        // ��ʾ����
		this.setVisible(true);
        
		this.addKeyListener(new KeyAdapter(){ 
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				if(panel.y==520) {
					 A=new test();
					dispose();
				}
				if(panel.y==600){
					System.exit(0);
				}	
			}
		}	
		});
		//System.out.print(panel.y);
	}
}
	






