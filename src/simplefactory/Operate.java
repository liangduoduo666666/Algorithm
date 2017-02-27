package simplefactory;

 abstract class Operate {
	private double nameA;
	private double nameB;
	
	public double getNameA(){
		return this.nameA ;
	}
	
	public double getNameB(){
		return this.nameB ;
	}
	
	public void setNameA(double nameA){
		this.nameA = nameA ;
	}
	public void setNameB(double nameB){
		this.nameB = nameB ;
	}
	public abstract double getResult();
}
