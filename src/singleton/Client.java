package singleton;

/**
 * µ¥ÀýÄ£Ê½
 * @author zhouliang
 *
 */
 class Client {
	public static void main(String[] args) {
		Person person = EagerSingleton.getInstance();
		Person person1 = EagerSingleton.getInstance(); 
		System.out.println(person.equals(person1));//true
		
		SingletonEnum s1 =  SingletonEnum.Person;
		SingletonEnum s2 =  SingletonEnum.Person;
		System.out.println(s1.equals(s2));//true
	}
}
