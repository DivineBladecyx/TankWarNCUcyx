package tank;

import java.awt.event.KeyEvent;

public class MAP2 extends LEVEL {
	public MAP2() {
		basecamp dabenying=new basecamp(230,620);
		 SomeQueues.basecampwall.add(dabenying);//生成大本营
		        EnemyTank enemy =new EnemyTank(60,0);
		        enemy.setDirect(1);  
		        SomeQueues.enemytankpanel.add(enemy); 
		        Thread t =new Thread(enemy);
		        t.start();//当调用了设计这个这个函数时，启动这个线程
		   for(int i=0;i<2;i++) {
	        	grass wall=new grass(0,40*(i+5));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
		   for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(190,40*i+590);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(310,40*i+590);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	}
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(230+40*i,590);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }

	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(0,(i+9)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(40,40*(i+2));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(40*(i+1),280);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	grass wall=new grass(40,40*(i+6));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(40,40*(i+7));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<6;i++) {
	        	canDestroywalls wall=new canDestroywalls(40,40*(i+9));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(120,40*(i+3));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	    
	        for(int i=0;i<2;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(120,(i)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(120,(i+8)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(120,40*(i+10));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(120,40*(i+14));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(200,40*(i+6));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<4;i++) {
	        	canDestroywalls wall=new canDestroywalls(200,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	grass wall=new grass(160,40*(i+7));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<2;i++) {
	        	grass wall=new grass(200+40*i,280);
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(240,(i)*40+80);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(240,40*(i+10));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<4;i++) {
	        	canDestroywalls wall=new canDestroywalls(280,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(280,(i)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(320,(i+6)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(280,(i+7)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(280,40*(i+1));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(360,40*(i+1));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(360,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(360,40*(i+10));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(360,40*(i+12));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(360,(i+3)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(400,(i+10)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(400,40*(i+13));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(400,(i+2)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(440,40*(i+1));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(440,40*(i+4));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<5;i++) {
	        	canDestroywalls wall=new canDestroywalls(440,40*(i+6));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(440,40*(i+12));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(480,(i+4)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<3;i++) {
	        	grass wall=new grass(400,40*(i+4));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(360,40*(i+1));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(360,40*(i+4));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁
	}
	

}
