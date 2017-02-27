package decorator;

class Mounting implements Work{
	Work w ;
	public  Mounting(Work w ){
		this.w = w;
	}
	@Override
	public void work() {
		w.work();
		System.out.println("¸ø»­×°ñÑ");
	}

}
