package tank;

import java.awt.event.KeyEvent;

public	class myTank extends Tank implements Runnable  {  
	    bullet thisbullet = null;
	    walliscrash crash=new walliscrash(); 
	   public boolean ismove=false;
	   int time=0;
	   public boolean isfire=false;
	    public myTank(int x,int y){  
	        super(x, y);  
	    } 
	    public void myiscrash(){//��ײ���
	            //ȡ�����еĵ���̹��
	            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
	                //ȡ����һ��̹��
	                EnemyTank enemytank = SomeQueues.enemytankpanel.get(i);
	                        if(x>=enemytank .x&&x<=enemytank .x+30&&y>=enemytank .y&&y<=enemytank .y+30){
	                            live=false;
	                        }
	                        if(x+30>=enemytank .x&&x+30<=enemytank .x+30&&y>=enemytank .y&&y<=enemytank .y+30){
	                        	live=false;
	                        }
	            }
	           
	    }
	     public void shotEnemy(){
	        switch (Direct) {
	        case 0:
	        	thisbullet= new bullet(x+10,y-5,0);//���ݷ������ж��ӵ����ı߿�ʼ��������Ϊ�ӵ��趨�˶�����
	        	SomeQueues.mybulletpanel.add(thisbullet);
	            break;
	        case 1:
	        	thisbullet= new bullet(x+10,y+31,1);
	        	SomeQueues.mybulletpanel.add(thisbullet);
	            break;
	        case 2: 
	        	thisbullet= new bullet(x-8,y+10,2);
	        	SomeQueues.mybulletpanel.add(thisbullet);
	            break;
	        case 3:
	        	thisbullet = new bullet(x+32,y+10,3);
	        	SomeQueues.mybulletpanel.add(thisbullet);
	            break;
	        default:
	            break;
	        }
	        Thread t =new Thread(thisbullet);
	        t.start();//���������������������ʱ����������߳�
	    }
	     public void move() {
	    		
	    		ismove=true;
	    		
	     }
	     public void fire() {
	    	 isfire=true;
	     }
	     public void stopfire() {
	    	 isfire=false;
	     }
	     public void stop() {
	    	ismove=false; 
	     }
	    public void moveUp(){ 
            //�����ƶ��ĺ���
	    
	    	y-=speed;
	    
            }  
	    public void moveDown(){  
	 
	        y+=speed;
	    }  
	    public void moveLeft(){  
	
              x-=speed;
	    	
	    }  
	    public void moveRight(){  

              x+=speed;
	    }
		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			 while (true) {
		            try {
		                Thread.sleep(50);
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		            
		            switch (Direct) {
		            case 0:
		            	
		            	if(!crash.cwiscrash(x,y,0)&&!crash.ctwiscrash(x,y,0)&&!crash.basecampcrush(x, y, 0)&&y>=10&&ismove==true&&!crash.wateriscrash(x,y,0)) 
		                    moveUp();
		            	
		                    try {
		                        Thread.sleep(100);
		                    } catch (Exception e) {
		                        e.printStackTrace();
		                    }
		            	 
		                
		                //˵��̹�����������ƶ�
		                break;
		            case 1:
		            	if(!crash.cwiscrash(x,y,1)&&!crash.ctwiscrash(x,y,1)&&!crash.basecampcrush(x, y, 1)&&y<=850&&ismove==true&&!crash.wateriscrash(x,y,1)) 
		            		moveDown();
		                    try {
		                        Thread.sleep(100);
		                    } catch (Exception e) {
		                        e.printStackTrace();
		                    }
		            	 
		                break;
		            case 2:

		            	if(!crash.cwiscrash(x,y,2)&&!crash.ctwiscrash(x,y,2)&&!crash.basecampcrush(x,y, 2)&&x>=10&&ismove==true&&!crash.wateriscrash(x,y,2))
		            		moveLeft();
		                    try {
		                        Thread.sleep(100);
		                    } catch (Exception e) {
		                        e.printStackTrace();
		                    }		
		            	 
		                break;
		            case 3:
		            	
		            	if(!crash.cwiscrash(x,y,3)&&!crash.ctwiscrash(x,y,3)&&!crash.basecampcrush(x, y, 3)&&x<=540&&ismove==true&&!crash.wateriscrash(x,y,3))
		            		moveRight();
		                    try {
		                        Thread.sleep(100);
		                    } catch (Exception e) {
		                        e.printStackTrace();
		                    }
		            	 
		                break;
		            default:  
		            	try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
		                break;
		            }		     
		            time++;
		            if(time%2==0){
		                if(live&&isfire==true){
		                    if(SomeQueues.mybulletpanel.size()<8){
		                    	bullet bu = null;
		                        //û���ӵ���  �����
		                        switch(Direct){
		                        case 0:
		                            bu = new bullet(x + 10, y - 5, 0);
		                            // ���ӵ��������
		                            SomeQueues.mybulletpanel.add(bu);		                        	
		                            break;
		                        case 1:
		                            bu = new bullet(x + 10, y + 31, 1);
		                            SomeQueues.mybulletpanel.add(bu);		                        	
		                            break;
		                        case 2:
		                            bu = new bullet(x - 8, y + 10, 2);
		                            SomeQueues.mybulletpanel.add(bu);	                        	
		                            break;
		                        case 3:
		                            bu = new bullet(x + 32, y + 10, 3);
		                            SomeQueues.mybulletpanel.add(bu);
		                            break;
		                        default:
		                            break;
		                        }
		                        //�����ӵ��߳�
		                        Thread t1 = new Thread(bu);
		                        t1.start();
		                    }
		                }
		          

				}  
			 }
			 
		}

	}  
