package observer;

import java.util.Observer;

/**
 * 
 * �۲���ģʽ
 * 
 * Test�������ȴ�����Watched��Watcher����
 * �ڴ���Watcher����ʱ����Watched������Ϊ�������룻
 * Ȼ��Test�������Watched�����setData()����������Watched������ڲ�״̬�仯��
 * Watched�������֪ͨʵ�ֵǼǹ���Watcher����Ҳ���ǵ�������update()������
 * 
 * @author zhouliang
 *
 */
class Client {

    public static void main(String[] args) {
        
        //�������۲��߶���
        Watched watched = new Watched();
        //�����۲��߶��󣬲������۲��߶���Ǽ�
        Observer watcher = new Watcher(watched);
        Observer watcher1 = new Watcher1(watched);
        
        //�����۲���״̬��ֵ
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }

}