package tank;

public class Isattacked {
	hitAudio hitaudio=new hitAudio();
	LEVEL A=null;
	public Isattacked() {
	}
	public  void basecampwallisttacked(bullet bu,basecamp wall){
		
	while(bu.x>wall.x-0.1&&bu.x<wall.x+79.9&&bu.y>wall.y-0.1&&bu.y<wall.y+79.9) {//�ж��ӵ��Ƿ�����˵з�̹��
			bu.nooutside=false;//�ӵ���ʧ
			bu.x=5000;//�ӵ����������
			wall.blood--;
			if(wall.blood==0) {
			wall.live=false;
			SomeQueues.basecampwall.remove(wall);//�Ƴ�����
			}
	}
}
	public void mbasecampwalljizhong()//�ҷ�̹�˻��д�Ӫ
	{
	
		for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
			bullet bul=SomeQueues.mybulletpanel.get(i);//����ÿһ���ӵ�
			if(bul.nooutside) {
				for(int j=0;j<SomeQueues.basecampwall.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
					basecamp dabenying=SomeQueues.basecampwall.get(j);
					if(dabenying.live) {
						basecampwallisttacked(bul, dabenying);
	}
				}
			}
			}
		}
	public void ebasecampwalljizhong()//�з�̹�˻��д�Ӫ
	{
		
		for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
			bullet bul=SomeQueues.enemybulletpanel.get(i);
			if(bul.nooutside) {
				for(int j=0;j<SomeQueues.basecampwall.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
					basecamp dabenying=SomeQueues.basecampwall.get(j);
					if(dabenying.live) {
						basecampwallisttacked(bul, dabenying);
	}
				}
		}
		}
		}
	public  void tankisattacked(bullet bu,Tank tank){
	switch(tank.Direct) {//0��1��ʾ���·���̹�˿�Ⱥͳ���������������һ��
	case 0:
	case 1:
		if(bu.x>tank.x-1&&bu.x<tank.x+31&&bu.y>tank.y-1&&bu.y<tank.y+31) {//�ж��ӵ��Ƿ�����˵з�̹��
			
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
		
			if(bu.x>wall.x+0.1&&bu.x<wall.x+39.9&&bu.y>wall.y+0.1&&bu.y<wall.y+39.9) {//�ж��ӵ��Ƿ�����˵з�̹��
				bu.nooutside=false;
				wall.live=false;
				SomeQueues.canDestroywallspanel.remove(wall);
		}
	}
	public  void cantdestroywallisattacked(bullet bu,cantDestroywalls wall){
		
		if(bu.x>=wall.x-0.1&&bu.x<=wall.x+39.9&&bu.y>wall.y-0.1&&bu.y<wall.y+39.9) {//�ж��ӵ��Ƿ�����˵з�̹��
			bu.nooutside=false;
	}
}
	public void candestroywallmyjizhong() {
		for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
		bullet bul=SomeQueues.mybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
				canDestroywalls enem=SomeQueues.canDestroywallspanel.get(j);
				if(enem.live) {
					candestroywallisattacked(bul, enem);
				}
		}
		}
		}
	}
	public void candestroywallenejizhong() {
		for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
		bullet bul=SomeQueues.enemybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.canDestroywallspanel.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
				canDestroywalls enem=SomeQueues.canDestroywallspanel.get(j);
				if(enem.live) {
					candestroywallisattacked(bul, enem);
				}
		}
		}
		}
	}
	public void cantdestroywallmyjizhong() {
		for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
		bullet bul=SomeQueues.mybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
				cantDestroywalls enem=SomeQueues.cantDestroywallspanel.get(j);
					cantdestroywallisattacked(bul, enem);
		}
		}
		}
	}
	public void cantdestroywallenejizhong() {
		for(int i=0;i<SomeQueues.enemybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
		bullet bul=SomeQueues.enemybulletpanel.get(i);
		if(bul.nooutside) {
			for(int j=0;j<SomeQueues.cantDestroywallspanel.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
				cantDestroywalls enem=SomeQueues.cantDestroywallspanel.get(j);
					cantdestroywallisattacked(bul, enem);
		}
		}
		}
	}
public void enemyjizhong() {
	for(int i=0;i<SomeQueues.mybulletpanel.size();i++) {//���ӵ��Ķ����ｫ�ӵ�����ȡ��
	bullet bul=SomeQueues.mybulletpanel.get(i);
	if(bul.nooutside) {
		for(int j=0;j<SomeQueues.enemytankpanel.size();j++) {//��̹�˶����ｫ̹�˰���ȡ��
			EnemyTank enem=SomeQueues.enemytankpanel.get(j);
			if(enem.live) {
			tankisattacked(bul, enem);
			}
	}
	}
	}
}
public void myTankjizhong() {
    // ȡ��ÿ�����˵�̹��
    for (int i = 0;i<SomeQueues.myTankpanel.size(); i++) {
        // ȡ��̹��
        myTank et=SomeQueues.myTankpanel.get(i);
        // ȡ��ÿ���ӵ�
        for (int j = 0; j < SomeQueues.enemybulletpanel.size(); j++) {
            bullet enemyShot = SomeQueues.enemybulletpanel.get(j);
            tankisattacked(enemyShot, et);
        }
    }
}
}