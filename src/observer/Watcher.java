package observer;

import java.util.Observable;
import java.util.Observer;

class Watcher implements Observer{
    
    public Watcher(Observable o){
        o.addObserver(this);
    }
   

	@Override
	public void update(Observable o, Object arg) {
        System.out.println("观察者0状态发生改变：" + ((Watched) o).getData());	
	}

}
