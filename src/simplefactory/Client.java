package simplefactory;

/**
 * �򵥹���ģʽ
 * @author zhouliang
 *
 */
 class Client {
	public static void main(String[] args) {
		Operate operate = null ;
		operate = OperateFactory.createOperate("+");
		operate.setNameA(3);
		operate.setNameB(4);
		double result = operate.getResult();
		System.out.println(result);
	}
}
