package tank;

public class bullet implements Runnable{//�ӵ��࣬��Ҫ�õ����̣߳�����Ҫʵ��runnable�ӿ�
    public int x;
    public  int y;
    public int Direct; //�ӵ���ʼ����
    public  int speed = 10;//�ӵ������ٶ�
    public  boolean nooutside = true;//�ж��ӵ��Ƿ����
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
            }//�ж��ӵ��Ƿ���磬������磬��outside��Ϊfalse���ҽ������ѭ��
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

