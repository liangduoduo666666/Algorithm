package proxy;

//房东
class Host implements Rent{

	@Override
	public void rent() {
		System.out.println("房东出租房间500一月");
	}

}
