package tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LEVEL extends JPanel implements KeyListener,Runnable{  

 
    Image image=null;
    drawpicture draw=new drawpicture();
    Isattacked a= new Isattacked();
    basecamp dabenying=null;
   int enemyTankcount=3;//敌方坦克的数量
  

	walliscrash crash=new walliscrash(); 
      
     public void paintComponent(Graphics g){  
        super.paintComponent(g);  
       // g.setColor(Color.BLACK);
       // g.fillRect(0, 0, 1200, 900);//灰色背景图片，原理是填充物
        
        for(int i=0;i<SomeQueues.canDestroywallspanel.size();i++) {
        	canDestroywalls wall1=SomeQueues.canDestroywallspanel.get(i);
        if(wall1.live==true) {
           draw.drawcanDestroywalls(SomeQueues.canDestroywallspanel.get(i).x, SomeQueues.canDestroywallspanel.get(i).y, g);  
        }
        else
        	SomeQueues.canDestroywallspanel.remove(wall1);
        } 
        for(int i=0;i<SomeQueues.basecampwall.size();i++) {
        	basecamp wall1=SomeQueues.basecampwall.get(i);
        if(wall1.live==true) {
           draw.drawbasecampwalls(SomeQueues.basecampwall.get(i).x, SomeQueues.basecampwall.get(i).y, g);  
        }
        else
        	SomeQueues.basecampwall.remove(wall1);
        } 
   for(int i=0;i<SomeQueues.waterwall.size();i++) {
        	draw.drawwater(SomeQueues.waterwall.get(i).x, SomeQueues.waterwall.get(i).y, g);  
        }
   for(int i=0;i<SomeQueues.grasswall.size();i++) {
   	draw.drawgrass(SomeQueues.grasswall.get(i).x, SomeQueues.grasswall.get(i).y, g);  
   }
        for(int i=0;i<SomeQueues.cantDestroywallspanel.size();i++) {
        	
        	cantDestroywalls wall1=SomeQueues.cantDestroywallspanel.get(i);
        	if(wall1.live==true)
        	draw.drawcantDestroywalls(SomeQueues.cantDestroywallspanel.get(i).x, SomeQueues.cantDestroywallspanel.get(i).y, g);  
        }
        for(int i=0;i<SomeQueues.enemytankpanel.size();i++) {
        	EnemyTank ene=SomeQueues.enemytankpanel.get(i);
        if(ene.live==true) {
           draw.drawenemyTank(SomeQueues.enemytankpanel .get(i).getX(), SomeQueues.enemytankpanel .get(i).getY(), g, SomeQueues.enemytankpanel .get(i).getDirect());  
        }
        else {
        	SomeQueues.enemytankpanel.remove(ene);      	
        } 
        }
        //敌方坦克  
        for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {
        	bullet onebullet=SomeQueues.mybulletpanel.get(i);
        if(onebullet.nooutside==true){ 
            draw.drawmybullet(onebullet.x, onebullet.y, g, 0 );
        }
        else
        	SomeQueues.mybulletpanel.remove(onebullet);
        } 
        for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {
        	bullet onebullet=SomeQueues.enemybulletpanel.get(i);
        if(onebullet.nooutside==true){           
        	draw.drawenemybullet(onebullet.x, onebullet.y, g, 0 );
        }
        else
        	SomeQueues.enemybulletpanel.remove(onebullet);
        } 
        for(int i=0;i<SomeQueues.myTankpanel.size();i++) {
        	myTank mytank=SomeQueues.myTankpanel.get(i);
        if(mytank.live==true) {
        	draw.drawmyTank(mytank.getX(),mytank.getY(),g,mytank.Direct);  
        }
        else
        	SomeQueues.myTankpanel.remove(mytank);
        }      
        if(SomeQueues.enemytankpanel.size()==0) {
        	draw.drawvictory(0, 0, g);
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
        }
        
            /*else
            {
            	 try {
                     image=ImageIO.read(new File("src/picture/over.gif"));
                     g.drawImage(image, 30,200, 400, 200, null);
                 } catch (Exception e) {

                     // TODO Auto-generated catch block

                     e.printStackTrace();

                 }
            }*/
       /* if(!dabenying.live) {
        	 try {
                 image=ImageIO.read(new File("src/picture/over.gif"));
                 g.drawImage(image, 30,200, 400, 200, null);
             } catch (Exception e) {

                 // TODO Auto-generated catch block

                 e.printStackTrace();

             }
        }*/
       
    }   
    public void keyTyped(KeyEvent e) {  
    }   
  
    public void keyReleased(KeyEvent e) {  
    }  
    public  void run() {
       
    }
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}

}  