package tank;  
public class Tank {  //tank������
   public int x = 0;  
   public int y = 0;  
   public int speed = 12;  //̹��ÿ���ƶ��ܹ��ƶ��ľ���
   public int Direct = 0;  //̹�˳�ʼ����
   public int color;  
   public boolean live=true;
   public Tank (int x,int y){  
       this.x = x;  
       this.y = y;  //̹�˵ĳ�ʼλ��
   }   
    public int getDirect() {  
        return Direct;  
    }  
    public void setDirect(int dir) {  
        Direct = dir;  
    }  
    public int NowSpeed() {  
        return speed;  
    }  
    public void setSpeed(int speed) {  
        this.speed = speed;  
    }  
    public int getX() {  
        return x;  
    }  
    public void setX(int x) {  
        this.x = x;  
    }  
    public int getY() {  
        return y;  
    }  
    public void setY(int y) {  
        this.y = y;  
    }    
}  

