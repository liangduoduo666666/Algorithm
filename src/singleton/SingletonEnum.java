package singleton;

enum SingletonEnum {
	Person("s"),
	Person1("p");//Person1和Person不是同一个实例
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
