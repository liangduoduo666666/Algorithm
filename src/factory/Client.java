package factory;

/**
 * 工厂模式
 * @author zhouliang
 *
 */
class Client {
	public static void main(String[] args) {
		int a = 3 ;
		int b = 4 ;
		String operate = "+";
		factory.OperateFactory operateFactory = null ;
		switch(operate){
			case "+": operateFactory = new AddFactory() ;
			case "-": operateFactory = new SubFactory() ;
		}
		operateFactory.setNameA(a);
		operateFactory.setNameB(b);
		double result = operateFactory.getResult();
		System.out.println(result);
	}
}
