package factory;

class AddFactory extends OperateFactory{

	@Override
	public double getResult() {
		double result = 0 ;
		result = this.getNameA()+this.getNameB() ; 
		return result;
	}

}
