package observer;

import java.util.Observable;
import java.util.Observer;

class Watcher1 implements Observer{
    
    public Watcher1(Observable o){
        o.addObserver(this);
    }
   

	@Override
	public void update(Observable o, Object arg) {
        System.out.println("�۲���1״̬�����ı䣺" + ((Watched) o).getData());	
	}

}
