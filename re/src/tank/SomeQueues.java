package tank;

import java.util.Vector;

public class SomeQueues {
	static Vector<bullet>mybulletpanel=new Vector<bullet>();//为自己坦克发出的子弹创建一个队列
	static Vector<myTank>myTankpanel=new Vector<myTank>();//为自己坦克创建一个队列
	 static Vector<bullet>enemybulletpanel=new Vector<bullet>();//为敌方坦克发出的子弹创建一个队列
	 static Vector<EnemyTank> enemytankpanel = new Vector<EnemyTank>();  //为敌方坦克创建一个队列
	 static Vector<canDestroywalls>canDestroywallspanel=new Vector<canDestroywalls>();//为能摧毁的和不能摧毁的墙壁各创建一个队列
	 static Vector<cantDestroywalls>cantDestroywallspanel=new Vector<cantDestroywalls>();
	 static Vector<basecamp>basecampwall=new Vector<basecamp>();//为大本营创建一个队列
	 static Vector<grass>grasswall=new Vector<grass>();//为草创建一个队列
	 static Vector<water>waterwall=new Vector<water>();//为水创建一个队列
}
