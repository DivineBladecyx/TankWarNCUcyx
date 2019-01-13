package tank;


//敌方坦克 类
public class EnemyTank extends Tank implements Runnable {
    fireAudio fireaudio=new fireAudio();
    walliscrash crash=new walliscrash();
    int time = 0;//创建一个时间变量
    public EnemyTank(int x, int y) {
        super(x, y);
    }
    public boolean etetiscrash(){//碰撞检测
        switch (Direct) {
        case 0:
            //取出所有的敌人坦克
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //取出第一个坦克
                EnemyTank enemytank = SomeQueues.enemytankpanel.get(i);
                //如果不是自己
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
            //取出所有的敌人坦克
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //取出第一个坦克
                EnemyTank enemytank  = SomeQueues.enemytankpanel.get(i);
                //如果不是自己
                if(enemytank !=this){
                    //如果敌人的方向是向下或者向上
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
            //取出所有的敌人坦克
            for(int i=0;i<SomeQueues.enemytankpanel.size();i++){
                //取出第一个坦克
                EnemyTank enemytank  = SomeQueues.enemytankpanel.get(i);
                //如果不是自己
                if(enemytank !=this){
                    //如果敌人的方向是向下或者向上

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
                //取出第一个坦克
                EnemyTank enemytank  = SomeQueues.enemytankpanel.get(i);
                //如果不是自己
                if(enemytank !=this){
                    //如果敌人的方向是向下或者向上
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
                //说明坦克正在向上移动
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
                        //没有子弹了  就添加
                        switch(Direct){

                        case 0:
                            // 创建一颗子弹
                            bu = new bullet(x + 10, y - 5, 0);
                            // 把子弹加入队列
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
                        //启动子单线程
                        Thread t1 = new Thread(bu);
                        t1.start();
                    }
                }
            }
            //让坦克随机产生新的方向
            Direct =  (int)(Math.random()*4);
            //判断敌人坦克是否死亡
            if(live==false){
                //让坦克死亡，退出线程
                break;
            }

        }
    }
}

