package tank;

import java.awt.BorderLayout;

import javax.swing.JFrame;

    
public class test extends JFrame{  
	 static MAP1 thread1=new MAP1();
	  static Thread t = new Thread(thread1);
	
	
    public test(){  
    
    	/*启动第一个线程*/
      
    		
        add(thread1);  
        setTitle("山寨坦克大战");
        setSize(840, 850);  
        setVisible(true);
        setLocation(500,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        addKeyListener(thread1);//监听窗口 
        choicePanel choicepanel=new choicePanel();
        add(choicepanel,BorderLayout.EAST);
        add(thread1,BorderLayout.WEST);
        t.start();	
        if(SomeQueues.basecampwall.size()==0) {
        	dispose();
        }
        
        

    }  
     public static void main(String[] args) {  
    	 new MyFrame();
		//new test();   //测试游戏
    }

}  
