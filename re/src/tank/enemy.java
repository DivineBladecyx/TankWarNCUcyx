package tank;


import java.util.TimerTask;

 class enemy extends TimerTask{
	 public void run() {  	
		 	int temp=(int)(Math.random()*3);
	        EnemyTank enemy =new EnemyTank(temp*100,temp*200);
	        enemy.setDirect(1);  
	        SomeQueues.enemytankpanel.add(enemy); 
	        Thread t =new Thread(enemy);
	        t.start();//当调用了设计这个这个函数时，启动这个线程        
	        SomeNumber.AddNumber++;
	        if(SomeNumber.AddNumber==3||SomeNumber.ShutNumber==3) {
	        	MAP1.timer1.cancel();
	        }
	 }
}
 class time extends TimerTask{
	 public void run() {  	
		 SomeNumber.AddTime++;
		 if(SomeNumber.AddTime==70) {
			 MAP1.timer.cancel();
		 }
	 }
 }


