package tank;

public class SomeWalls {//����ǽ������
	  public int x = 0;  
	   public int y = 0;  
	   public SomeWalls(int x,int y) {
		   this.x=x;
		   this.y=y;
	   }
	   
}
class canDestroywalls extends SomeWalls{//�ɴݻٵ�ǽ����
	 public canDestroywalls(int x,int y){  
	        super(x, y);  
	    } 
	   public boolean live=true;
}
class cantDestroywalls extends SomeWalls{//���ɴݻٵ�ǽ����
	 public cantDestroywalls(int x,int y){  
	        super(x, y);  
	    } 
	 public boolean live=true;
}
class basecamp extends SomeWalls{//��Ӫ����
	public basecamp(int x,int y) {
	super(x,y);
	}
	public boolean live=true;
	public int blood=3;
	
	}
class water extends SomeWalls{

	public water(int x, int y) {
		super(x, y);
		// TODO �Զ����ɵĹ��캯�����
	}
}
class grass extends SomeWalls{

	public grass(int x, int y) {
		super(x, y);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
