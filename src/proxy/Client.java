package proxy;

/**
 * 代理模式
 * @author zhouliang
 *
 */
class Client {
	public static void main(String[] args) {
		Company c = new Company();
		c.rent();
	}
}
