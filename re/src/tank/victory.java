package tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.imageio.ImageIO;

public class victory extends LEVEL{
	public victory() {
		
	}
	 public void paintComponent(Graphics g){  
	        super.paintComponent(g);  
	        g.setColor(Color.blue);
	        g.fillRect(0, 0, 1200, 900);//灰色背景图片，原理是填充物
	       draw.drawvictory(0, 0, g);
	    }   
/*	public synchronized void run() {
	    while(true){
	        try {
	            Thread.sleep(100);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }	        
	        if(e.getKeyCode()!=KeyEvent.VK_ENTER)
	        	 new MAP2();
	       a.enemyjizhong();//判断击中
	    	a.myTankjizhong();
	    	mytank.myiscrash();
	    	a.candestroywallmyjizhong();
	    	a.candestroywallenejizhong();
	    	a.cantdestroywallmyjizhong();
	    	a.cantdestroywallenejizhong();
	    	a.ebasecampwalljizhong();
	    	a.mbasecampwalljizhong();
	        repaint();
	        
	    }
	   
	    
	}*/
}
