package decorator;

/**
 * װ����ģʽ
 * @author zhouliang
 *
 */
class Client {
	public static void main(String[] args) {
		Work w = new Drawing();
		Color c = new Color(w);
		Mounting m = new Mounting(c);
		m.work();
	}
}
