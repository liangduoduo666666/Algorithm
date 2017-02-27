package simplefactory;

 class SubOperate extends Operate{

	@Override
	public double getResult() {
		double result = 0 ;
		result = this.getNameA()-this.getNameB() ; 
		return result;
	}

}
