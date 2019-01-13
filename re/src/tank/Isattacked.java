package tank;

public class Isattacked {
	hitAudio hitaudio=new hitAudio();
	LEVEL A=null;
	public Isattacked() {
	}
	public  void basecampwallisttacked(bullet bu,basecamp wall){
		
	while(bu.x>wall.x-0.1&&bu.x<wall.x+79.9&&bu.y>wall.y-0.1&&bu.y<wall.y+79.9) {//判断子弹是否击中了敌方坦克
			bu.nooutside=false;//子弹消失
			bu.x=5000;//子弹横坐标出界
			wall.blood--;
			if(wall.blood==0) {
			wall.live=false;
			SomeQueues.basecampwall.remove(wall);//移除向量
			}
	}
}
	public void mbasecampwalljizhong()//我方坦克击中大本营
	{
	
		for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
			bullet bul=SomeQueues.mybulletpanel.get(i);//遍历每一颗子弹
			if(bul.nooutside) {
				for(int j=0;j<SomeQueues.basecampwall.size();j++) {//从坦克队列里将坦克挨个取出
					basecamp dabenying=SomeQueues.basecampwall.get(j);
					if(dabenying.live) {
						basecampwallisttacked(bul, dabenying);
	}
				}
			}
			}
		}
	public void ebasecampwalljizhong()//敌方坦克击中大本营
	{
		
		for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
			bullet bul=SomeQueues.enemybulletpanel.get(i);
			if(bul.nooutside) {
				for(int j=0;j<SomeQueues.basecampwall.size();j++) {//从坦克队列里将坦克挨个取出
					basecamp dabenying=SomeQueues.basecampwall.get(j);
					if(dabenying.live) {
						basecampwallisttacked(bul, dabenying);
	}
				}
		}
		}
		}
	public  void tankisattacked(bullet bu,Tank tank){
	switch(tank.Direct) {//0和1表示上下方向，坦克宽度和长度这两个方向上一样
	case 0:
	case 1:
		if(bu.x>tank.x-1&&bu.x<tank.x+31&&bu.y>tank.y-1&&bu.y<tank.y+31) {//判断子弹是否击中了敌方坦克
			
			bu.nooutside=false;
			tank.live=false;
	           SomeNumber.ShutNumber++;
	}
		break;
	case 2:
	case 3:
		if(bu.x>tank.x-1&&bu.x<tank.x+31&&bu.y>tank.y-1&&bu.y<tank.y+31) {
			
			bu.nooutside=false;
			tank.live=false;
	           SomeNumber.ShutNumber++;
		}
		break;
	default:
		break;
	}
}
	public  void candestroywallisattacked(bullet bu,canDestroywalls wall){
		
			if(bu.x>wall.x+0.1&&bu.x<wall.x+39.9&&bu.y>wall.y+0.1&&bu.y<wall.y+39.9) {//判断子弹是否击中了敌方坦克
				bu.nooutside=false;
				wall.live=false;
				SomeQueues.canDestroywallspanel.remove(wall);
		}
	}
	public  void cantdestroywallisattacked(bullet bu,cantDestroywalls wall){
		
		if(bu.x>=wall.x-0.1&&bu.x<=wall.x+39.9&&bu.y>wall.y-0.1&&bu.y<wall.y+39.9) {//判断子弹是否击中了敌方坦克
			bu.nooutside=false;
	}
}
	public void candestroywallmyjizhong() {
		for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
		bullet bul=SomeQueues.mybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {//从坦克队列里将坦克挨个取出
				canDestroywalls enem=SomeQueues.canDestroywallspanel.get(j);
				if(enem.live) {
					candestroywallisattacked(bul, enem);
				}
		}
		}
		}
	}
	public void candestroywallenejizhong() {
		for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
		bullet bul=SomeQueues.enemybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {//从坦克队列里将坦克挨个取出
				canDestroywalls enem=SomeQueues.canDestroywallspanel.get(j);
				if(enem.live) {
					candestroywallisattacked(bul, enem);
				}
		}
		}
		}
	}
	public void cantdestroywallmyjizhong() {
		for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
		bullet bul=SomeQueues.mybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {//从坦克队列里将坦克挨个取出
				cantDestroywalls enem=SomeQueues.cantDestroywallspanel.get(j);
					cantdestroywallisattacked(bul, enem);
		}
		}
		}
	}
	public void cantdestroywallenejizhong() {
		for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
		bullet bul=SomeQueues.enemybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {//从坦克队列里将坦克挨个取出
				cantDestroywalls enem=SomeQueues.cantDestroywallspanel.get(j);
					cantdestroywallisattacked(bul, enem);
		}
		}
		}
	}
public void enemyjizhong() {
	for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//从子弹的队列里将子弹挨个取出
	bullet bul=SomeQueues.mybulletpanel.get(i);
	if(bul.nooutside) {
		for(int j=0;j<SomeQueues.enemytankpanel.size();j++) {//从坦克队列里将坦克挨个取出
			EnemyTank enem=SomeQueues.enemytankpanel.get(j);
			if(enem.live) {
			tankisattacked(bul, enem);
			}
	}
	}
	}
}
public void myTankjizhong() {
    // 取出每个敌人的坦克
    for (int i = 0;i<SomeQueues.myTankpanel.size(); i++) {
        // 取出坦克
        myTank et=SomeQueues.myTankpanel.get(i);
        // 取出每颗子弹
        for (int j = 0; j < SomeQueues.enemybulletpanel.size(); j++) {
            bullet enemyShot = SomeQueues.enemybulletpanel.get(j);
            tankisattacked(enemyShot, et);
        }
    }
}
}