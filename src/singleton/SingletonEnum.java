package singleton;

enum SingletonEnum {
	Person("s"),
	Person1("p");//Person1��Person����ͬһ��ʵ��
	private String name;
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	private SingletonEnum(String name){
		this.name  = name;
	}
}
