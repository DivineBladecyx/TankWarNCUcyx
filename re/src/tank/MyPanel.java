package tank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanel extends JPanel implements KeyListener{
	int x=10;
	int y=520;
	JButton[] bt=new JButton[2];
	public MyPanel(){
		super();
		//改变布局管理方式
		setLayout(null); 
		button(bt);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		drawString(g);
		drawImage(g);
		//g.setColor(Color.RED);
		//g.fillOval(x, y, 20, 20);
		//System.out.println(y);
		setBackground(Color.gray);
	}	
	@Override
	//键入某个键时调用
	public void keyTyped(KeyEvent e) {
	}
	@Override
	//按下某个键时调用
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(y>599) {
			}
			else
				y=y+80;
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(y<520) {
			}
			else
				y=y-80;
		}
		/*if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(y==500) {
				frame.dispose();
				new test();
			}
			else {
				System.exit(0);
			}
				
		}*/
		//System.out.print("使用了");
		this.repaint();
	}
	@Override
	//释放某个键时调用
	public void keyReleased(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	private void button(JButton[] bt) {
		bt[0]=new JButton("进入游戏");
		//bt[1]=new JButton("游戏历史");
		bt[1]=new JButton("退出游戏");
		
		for(int i=0;i<=1;i++) {
			//设置按钮文字的样式
			bt[i].setFont(new Font("楷体",Font.PLAIN,40));
			bt[i].setForeground(Color.blue);
			bt[i].setBorderPainted(false);
			//设置组件的位置和大小
			bt[i].setBounds(400,500+80*i, 250, 75);
			//按钮背景颜色,如果按钮为透明则无效
			bt[i].setBackground(Color.green); 
			//设置按钮为透明
			bt[i].setContentAreaFilled(false); 
			//设置凸起来的按钮
			//bt.setBorder(BorderFactory.createRaisedBevelBorder());
			//for(int j=0;j<=1;j++) {
			add(bt[i]);
			//}
		}
	}
	public void drawString(Graphics g) {
		
		Font font1=new Font("楷体",Font.ITALIC,200);
		//Color c=new Color(0.3f,0.3f,0.4f);
		g.setFont(font1);
		g.setColor(Color.red);
		g.drawString("T A N K", 150, 200);
		
		/*Font font2=new Font("楷体",Font.ITALIC,50);
		g.setFont(font2);
		g.setColor(Color.blue);
		g.drawString("start", 500, 500);*/
	}
	public void drawImage(Graphics g){
		Image image = null;
		try {
			image = ImageIO.read(new File("src/picture/p2tankR.gif"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		ImageObserver paintingChild = null;
		g.drawImage(image,340,y,80,30, paintingChild);
		
	}
	
}













