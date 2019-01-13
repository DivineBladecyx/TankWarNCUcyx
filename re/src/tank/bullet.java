package tank;

public class bullet implements Runnable{//子弹类，需要用到多线程，所以要实现runnable接口
    public int x;
    public  int y;
    public int Direct; //子弹初始方向
    public  int speed = 10;//子弹运行速度
    public  boolean nooutside = true;//判断子弹是否出界
    public bullet(int x,int y,int Dir){
        this.x=x;
        this.y=y;
        this.Direct = Dir;
    }
     public void run() {
        while(true){
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            if(x<0||x>540||y<0||y>850){
                nooutside = false;
                break;
            }//判断子弹是否出界，如果出界，则将outside置为false，且结束这个循环
            switch(Direct){
            case 0: 
                y-=speed;
                break;
            case 1:
                y+=speed;
                break;
            case 2:
                x-=speed;
                break;
            case 3:
                x+=speed;
                break;
            default:
                break;
            }
        }
    }
}

