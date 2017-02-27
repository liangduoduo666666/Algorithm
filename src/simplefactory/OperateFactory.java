package simplefactory;

 class OperateFactory {
	public static Operate createOperate(String operate){
		Operate result = null ;
		switch(operate){
			case "+" : result = new AddOperate(); break;
			case "-" : result = new SubOperate(); break;
			default : break;
		}
		return result;
	}
}
