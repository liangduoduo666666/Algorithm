package singleton;

class Singleton {
	private volatile static Person instance = null;
	private Singleton (){}
	public static Person getInstance(){
		if(instance==null){
			synchronized(Singleton.class){
				if(instance==null){
					instance = new Person();
				}
			}
		}
		return instance;
	}
}
