package tank;

public class MAP3 extends LEVEL{
	public MAP3() {
		 basecamp dabenying=new basecamp(230,620);
	        for(int i=0;i<2;i++) {
	        	water wall=new water(120,40*(i));
	        	 SomeQueues.waterwall.add(wall); 
	        }//生成水
	        for(int i=0;i<4;i++) {
	        	water wall=new water(120,40*(i+3));
	        	 SomeQueues.waterwall.add(wall); 
	        }//生成水
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(120,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(120,(i+11)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(120,40*(i+12));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	water wall=new water(160,40*(i+6));
	        	 SomeQueues.waterwall.add(wall); 
	        }//生成水
	        for(int i=0;i<4;i++) {
	        	water wall=new water(240+40*i,240);
	        	 SomeQueues.waterwall.add(wall); 
	        }//生成水
	        for(int i=0;i<5;i++) {
	        	water wall=new water(360,40*(i+6));
	        	 SomeQueues.waterwall.add(wall); 
	        }//生成水
	        for(int i=0;i<2;i++) {
	        	water wall=new water(360,40*(i+12));
	        	 SomeQueues.waterwall.add(wall); 
	        }//生成水
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(400,40*i);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(400,40*(i+2));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(200,40*i);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(200,40*(i+3));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(280,40*(i+4));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<4;i++) {
	        	canDestroywalls wall=new canDestroywalls(320,40*(i));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	       
	        for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(200,40*(i+9));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(440,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(480,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(480,40*(i+5));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	grass wall=new grass(240,40*(i+8));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<4;i++) {
	        	grass wall=new grass(280,40*(i+7));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<2;i++) {
	        	grass wall=new grass(320,40*(i+8));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<2;i++) {
	        	grass wall=new grass(400,40*(i+11));
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
	        	canDestroywalls wall=new canDestroywalls(510+40*i,190);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }

	        for(int i=0;i<4;i++) {
	        	grass wall=new grass(440,40*(i+10));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<2;i++) {
	        	grass wall=new grass(480,40*(i+11));
	        	 SomeQueues.grasswall.add(wall); 
	        }//生成草
	        for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(200+40*i,440);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(200,(i+4)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(480,(i+6)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(400,(i+1)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(200,(i+8)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(0,(i+4)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(240,(i+3)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	       
	        for(int i=0;i<1;i++) {
	        	canDestroywalls wall=new canDestroywalls(0,40*(i+6));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(0,40*(i+8));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(40,320);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<1;i++) {
	        	cantDestroywalls wall=new cantDestroywalls(40,(i+11)*40);
	        	 SomeQueues.cantDestroywallspanel.add(wall); 
	        }//生成不可摧毁墙
	        for(int i=0;i<2;i++) {
	        	canDestroywalls wall=new canDestroywalls(40,(i+12)*40);
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁墙
	        for(int i=0;i<3;i++) {
	        	canDestroywalls wall=new canDestroywalls(80,40*(i+4));
	        	 SomeQueues.canDestroywallspanel.add(wall); 
	        }//生成可摧毁
	     
	        SomeQueues.basecampwall.add(dabenying);//生成大本营

	            EnemyTank enemy =new EnemyTank(60,0);
	            enemy.setDirect(1);  
	            SomeQueues.enemytankpanel.add(enemy); 
	            Thread t =new Thread(enemy);
	            t.start();//当调用了设计这个这个函数时，启动这个线程	        
	}
}
