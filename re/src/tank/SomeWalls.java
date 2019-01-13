package tank;

public class SomeWalls {//所有墙的主类
	  public int x = 0;  
	   public int y = 0;  
	   public SomeWalls(int x,int y) {
		   this.x=x;
		   this.y=y;
	   }
	   
}
class canDestroywalls extends SomeWalls{//可摧毁的墙的类
	 public canDestroywalls(int x,int y){  
	        super(x, y);  
	    } 
	   public boolean live=true;
}
class cantDestroywalls extends SomeWalls{//不可摧毁的墙的类
	 public cantDestroywalls(int x,int y){  
	        super(x, y);  
	    } 
	 public boolean live=true;
}
class basecamp extends SomeWalls{//大本营的类
	public basecamp(int x,int y) {
	super(x,y);
	}
	public boolean live=true;
	public int blood=3;
	
	}
class water extends SomeWalls{

	public water(int x, int y) {
		super(x, y);
		// TODO 自动生成的构造函数存根
	}
}
class grass extends SomeWalls{

	public grass(int x, int y) {
		super(x, y);
		// TODO 自动生成的构造函数存根
	}
	
}
