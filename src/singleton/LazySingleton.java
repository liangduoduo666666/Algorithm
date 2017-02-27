package singleton;

class LazySingleton {
	private static Person instance = null;
	
	private LazySingleton (){}
	
	public static Person getInstance(){
		if(instance==null){
			instance = new Person();
		}
		return instance;
	}
}
