package decorator;

class Color implements Work{
	Work w;
	public Color(Work w){
		this.w = w;
	}
	@Override
	public void work() {
		w.work();
		System.out.println("иои╚");
	}

}
