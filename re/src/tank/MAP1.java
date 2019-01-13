package tank;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.JLabel;

public class MAP1 extends LEVEL {

	  basecamp dabenying=null;
	   myTank mytank = null;  
	   int j=0;
	   int k=0;
	   victory vic=null;
	   public static Timer timer1 = new Timer(); 
	   public static Timer timer2 = new Timer(); 
	   public static Timer timer3 = new Timer();
	   public static Timer timer=new Timer();
public MAP1(){
setLayout(null);
setPreferredSize(new Dimension(540,850));
	dabenying= new basecamp(230,720);
	mytank = new myTank(0,700);//设置坦克出现的位置（10，10）
	Thread mytank1=new Thread(mytank);
	mytank1.start();
    SomeQueues.myTankpanel .add(mytank);//生成己方坦克
    for(int i=0;i<2;i++) {
    	cantDestroywalls wall=new cantDestroywalls(40*i,400);
    	 SomeQueues.cantDestroywallspanel.add(wall); 
    }//生成不可摧毁墙
    for(int i=0;i<1;i++) {
    	cantDestroywalls wall=new cantDestroywalls(480,(i)*40+380);
    	 SomeQueues.cantDestroywallspanel.add(wall); 
    }//生成不可摧毁墙
    for(int i=0;i<1;i++) {
    	cantDestroywalls wall=new cantDestroywalls(240,240);
    	 SomeQueues.cantDestroywallspanel.add(wall); 
    }//生成不可摧毁墙
    for(int i=0;i<6;i++) {
    	canDestroywalls wall=new canDestroywalls(40,40*(i+2));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<3;i++) {
    	canDestroywalls wall=new canDestroywalls(40,40*(i+13));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<1;i++) {
    	canDestroywalls wall=new canDestroywalls(280,40*(i+2));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<4;i++) {
    	canDestroywalls wall=new canDestroywalls(200,40*(i+11));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<1;i++) {
    	canDestroywalls wall=new canDestroywalls(120,40*(i+9));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=1;i<1;i++) {
    	canDestroywalls wall=new canDestroywalls(20,40*(i+9));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<4;i++) {
    	canDestroywalls wall=new canDestroywalls(120,40*(i+12));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<4;i++) {
    	canDestroywalls wall=new canDestroywalls(280,40*(i+11));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<1;i++) {
    	canDestroywalls wall=new canDestroywalls(240,40*(i+12));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<6;i++) {
    	canDestroywalls wall=new canDestroywalls(360,40*(i+2));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<4;i++) {
    	canDestroywalls wall=new canDestroywalls(440,40*(i+12));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<2;i++) {
    	canDestroywalls wall=new canDestroywalls(230+i*40,680);
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<4;i++) {
    	canDestroywalls wall=new canDestroywalls(440,40*(i+12));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<4;i++) {
    	canDestroywalls wall=new canDestroywalls(360,40*(i+12));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<1;i++) {
    	canDestroywalls wall=new canDestroywalls(200,40*(i+12));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<6;i++) {
    	canDestroywalls wall=new canDestroywalls(440,40*(i+2));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<6;i++) {
    	canDestroywalls wall=new canDestroywalls(120,40*(i+2));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<3;i++) {
    	canDestroywalls wall=new canDestroywalls(190,760-40*i);
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<3;i++) {
    	canDestroywalls wall=new canDestroywalls(310,760-40*i);
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<2;i++) {
    	canDestroywalls wall=new canDestroywalls(360+40*i,380);
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙
    for(int i=0;i<6;i++) {
    	canDestroywalls wall=new canDestroywalls(200,40*(i+2));
    	 SomeQueues.canDestroywallspanel.add(wall); 
    }//生成可摧毁墙

    SomeQueues.basecampwall.add(dabenying);//生成大本营
  
        EnemyTank enemy =new EnemyTank(0,0);
        enemy.setDirect(1);  
        SomeQueues.enemytankpanel.add(enemy); 
        Thread t =new Thread(enemy);
        t.start();//当调用了设计这个这个函数时，启动这个线程
 
        timer1.schedule(new enemy(), 1000, 3000);
        timer.schedule(new time(), 1000, 1000);
}
int h=0;
public void run() {
    while(true){
    	  
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        choicePanel.lb4.setText(String.valueOf(SomeNumber.ShutNumber));
        choicePanel.lb16.setText(SomeNumber.AddTime/60+":"+String.valueOf(SomeNumber.AddTime%60));
        choicePanel.lb18.setText(String.valueOf(1+SomeNumber.AddNumber-SomeNumber.ShutNumber));
       // if(SomeNumber.AddTime<60) {
        	//choicePanel.lb16.setText("0:"+String.valueOf(SomeNumber.AddTime));
       // }
        
       a.enemyjizhong();//判断击中
    	a.myTankjizhong();
    	mytank.myiscrash();
    	a.candestroywallmyjizhong();
    	a.candestroywallenejizhong();
    	a.cantdestroywallmyjizhong();
    	a.cantdestroywallenejizhong();
    	a.ebasecampwalljizhong();
    	a.mbasecampwalljizhong();
    	
    	/*if(SomeQueues.basecampwall.size()==0) {   		
	        repaint();
    		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}   
    		
    	System.exit(0);
    	}*/
    	 if(SomeQueues.enemytankpanel.size()!=0) {  
        repaint();
    	 } 
    	 else {
    		 
    		 if(j==0) { 
    			timer2.schedule(new enemy(), 3000, 10000);
    			 j++;
 	        	SomeQueues.canDestroywallspanel.clear(); 	        
 	        	SomeQueues.basecampwall.clear();
 	        	SomeQueues.cantDestroywallspanel.clear();
 	        	SomeQueues.enemytankpanel.clear();      	    	       	
 	        //敌方坦克  
 	        	SomeQueues.mybulletpanel.clear();	   
 	        	SomeQueues.enemybulletpanel.clear();	        
 	        	SomeQueues.myTankpanel.clear(); 
 	        repaint();
 	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
 	        new MAP2();
 	        SomeNumber.AddNumber=0;
 	        SomeNumber.ShutNumber=0;
 			mytank = new myTank(100,500);//设置坦克出现的位置（10，10）
 	        SomeQueues.myTankpanel .add(mytank);//生成己方坦克 
 	        Thread t3=new Thread(mytank);
 	        t3.start();
    	 } 
    		 if(SomeQueues.enemytankpanel.size()==0)
  	        	k++;
    		 if(k==1) {
    				timer2.cancel();
        			timer3.schedule(new enemy(), 3000, 10000);
 	        	SomeQueues.canDestroywallspanel.clear(); 	        
 	        	SomeQueues.basecampwall.clear();
 	        	SomeQueues.cantDestroywallspanel.clear();
 	        	SomeQueues.enemytankpanel.clear();      	    	       	
 	        //敌方坦克  
 	        	SomeQueues.mybulletpanel.clear();	   
 	        	SomeQueues.enemybulletpanel.clear();	        
 	        SomeQueues.myTankpanel.clear(); 
 	        repaint();
 	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
 	        new MAP3(); 	       
 			mytank = new myTank(100,500);//设置坦克出现的位置（10，10）
 	        SomeQueues.myTankpanel .add(mytank);//生成己方坦克 
 	        Thread t4=new Thread(mytank);
 	        t4.start();
 	        if(SomeQueues.enemytankpanel.size()==0) {
 	  	 k++; 
 	  	 timer3.cancel();
    	 }    		 
    		 }
    	 repaint();
    }
    }
}
public void keyReleased(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_UP){ 
		mytank.stop();
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){  
		mytank.stop();  
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){  
		mytank.stop();  
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){   
		mytank.stop();
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			mytank.stopfire();
		}
}
public void keyPressed(KeyEvent e) {
    //实现接口 ，重写keypressed方法，根据按键上下左右移动 可以控制速度和移动  
if(e.getKeyCode()==KeyEvent.VK_UP){ 
mytank.setDirect(0);  //向上走就设置方向为上，其他一样
mytank.move();
}
if(e.getKeyCode()==KeyEvent.VK_DOWN){  
mytank.setDirect(1);
mytank.move();  
}
if(e.getKeyCode()==KeyEvent.VK_LEFT){  
mytank.setDirect(2);  
mytank.move();  
}
if(e.getKeyCode()==KeyEvent.VK_RIGHT){  
mytank.setDirect(3);  
mytank.move();
}
if(e.getKeyCode()==KeyEvent.VK_SPACE){//摁下空格开火
if(SomeQueues.mybulletpanel.size()<=2000) {
	mytank.fire();
}
}
repaint();  
}
}
