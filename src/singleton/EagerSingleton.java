package singleton;

 class EagerSingleton {
	private static Person instance = new Person();
	
	private EagerSingleton(){}
	
	public static Person getInstance(){
		return instance;
	}
}
