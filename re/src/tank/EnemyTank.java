package tank;


//�з�̹�� ��
public class EnemyTank extends Tank implements Runnable {
    fireAudio fireaudio=new fireAudio();
    walliscrash crash=new walliscrash();
    int time = 0;//����һ��ʱ�����
    public EnemyTank(int x, int y) {
        super(x, y);
    }
    public boolean etetiscrash(){//��ײ���
        switch (Direct) {
        case 0:
            //ȡ�����еĵ���̹��
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //ȡ����һ��̹��
                EnemyTank enemytank = SomeQueues.enemytankpanel.get(i);
                //��������Լ�
                if(enemytank !=this){
                        if(x>=enemytank .x&&x<=enemytank .x+30&&y>=enemytank .y&&y<=enemytank .y+30){
                            return true;
                        }
                        if(x+30>=enemytank .x&&x+30<=enemytank .x+30&&y>=enemytank .y&&y<=enemytank .y+30){
                            return true;
                        }
                }
            }
            break;
        case 1:
            //ȡ�����еĵ���̹��
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //ȡ����һ��̹��
                EnemyTank enemytank  = SomeQueues.enemytankpanel.get(i);
                //��������Լ�
                if(enemytank !=this){
                    //������˵ķ��������»�������
                        if(x>=enemytank .x&&x<=enemytank .x+30&&y+30>=enemytank .y&&y+30<=enemytank .y+30){
                            return true;
                        }
                        if(x+30>=enemytank .x&&x+30<=enemytank .x+30&&y+30>=enemytank .y&&y+30<=enemytank .y+30){
                            return true;
                    }
                }
            }
            break;
        case 2:
            //ȡ�����еĵ���̹��
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //ȡ����һ��̹��
                EnemyTank enemytank  = SomeQueues.enemytankpanel.get(i);
                //��������Լ�
                if(enemytank !=this){
                    //������˵ķ��������»�������

                        if(x>=enemytank .x&&x<=enemytank .x+30&&y>=enemytank .y&&y<=enemytank .y+30){
                            return true;
                        }
                        if(x>=enemytank .x&&x<=enemytank .x+30&&y+30>=enemytank .y&&y+30<=enemytank .y+30){
                            return true;
                        }
                }
            }
            break;
        case 3:
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //ȡ����һ��̹��
                EnemyTank enemytank  = SomeQueues.enemytankpanel.get(i);
                //��������Լ�
                if(enemytank !=this){
                    //������˵ķ��������»�������
                        if(x+30>=enemytank .x&&x+30<=enemytank .x+30&&y>=enemytank .y&&y<=enemytank .y+30){
                            return true;
                        }
                        if(x+30>=enemytank .x&&x+30<=enemytank .x+30&&y+30>=enemytank .y&&y+30<=enemytank .y+30){
                            return true;
                        }
                }
            }
            break;
        default:
            break;
        }
        return false;
    }
   
      public synchronized void run() { 
        while (true) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (Direct) {
            case 0:
                for(int i=0;i<3;i++){
                    if(y>0&&!etetiscrash()&&!crash.cwiscrash(x,y,0)&&!crash.ctwiscrash(x,y,0)&&!crash.basecampcrush(x, y, 0)&&!crash.wateriscrash(x,y,0))
                    y-=speed;
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                //˵��̹�����������ƶ�
                break;
            case 1:
                for(int i=0;i<3;i++){
                    if(y<850&&!etetiscrash()&&!crash.cwiscrash(x,y,1)&&!crash.ctwiscrash(x,y,1)&&!crash.basecampcrush(x, y, 1)&&!crash.wateriscrash(x,y,1))
                    y+=speed;
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 2:
                for(int i=0;i<3;i++){
                    if(x>0&&!etetiscrash()&&!crash.cwiscrash(x,y,2)&&!crash.ctwiscrash(x,y,2)&&!crash.basecampcrush(x, y, 2)&&!crash.wateriscrash(x,y,2))
                    x-=speed;
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                for(int i=0;i<3;i++){
                    if(x<540&&!etetiscrash()&&!crash.cwiscrash(x,y,3)&&!crash.ctwiscrash(x,y,3)&&!crash.basecampcrush(x, y, 3)&&!crash.wateriscrash(x,y,3))
                    x+=speed;
                    try {
                        Thread.sleep(300);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
            }
            time++;
            if(time%2==0){
                if(live){
                    if(SomeQueues.enemybulletpanel.size()<8){
                    	bullet bu = null;
                        //û���ӵ���  �����
                        switch(Direct){

                        case 0:
                            // ����һ���ӵ�
                            bu = new bullet(x + 10, y - 5, 0);
                            // ���ӵ��������
                            SomeQueues.enemybulletpanel.add(bu);
                            break;
                        case 1:
                            bu = new bullet(x + 10, y + 31, 1);
                            SomeQueues.enemybulletpanel.add(bu);
                            break;
                        case 2:
                            bu = new bullet(x - 8, y + 10, 2);
                            SomeQueues.enemybulletpanel.add(bu);
                            break;
                        case 3:
                            bu = new bullet(x + 32, y + 10, 3);
                            SomeQueues.enemybulletpanel.add(bu);
                            break;
                        default:
                            break;
                        }
                        //�����ӵ��߳�
                        Thread t1 = new Thread(bu);
                        t1.start();
                    }
                }
            }
            //��̹����������µķ���
            Direct =  (int)(Math.random()*4);
            //�жϵ���̹���Ƿ�����
            if(live==false){
                //��̹���������˳��߳�
                break;
            }

        }
    }
}

