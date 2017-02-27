package observer;

import java.util.Observable;
import java.util.Observer;

class Watcher implements Observer{
    
    public Watcher(Observable o){
        o.addObserver(this);
    }
   

	@Override
	public void update(Observable o, Object arg) {
        System.out.println("�۲���0״̬�����ı䣺" + ((Watched) o).getData());	
	}

}
