package simplefactory;

 class AddOperate extends Operate{

	@Override
	public double getResult() {
		double result = 0 ;
		result = this.getNameA()+this.getNameB() ; 
		return result;
	}

}
