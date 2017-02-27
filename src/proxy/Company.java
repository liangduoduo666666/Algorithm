package proxy;

class Company implements Rent{

	Host host = new Host();
	@Override
	public void rent() {
		host.rent();
		System.out.println("租房中介租房，房租800");
	}

}
