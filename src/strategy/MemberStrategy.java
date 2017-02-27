package strategy;

//抽象算法类，定义所有支持的算法的公共接口
public interface MemberStrategy {

	/**
	 * 计算图书的价格
	 * @param booksPrice 图书的原价
	 * @return 折扣后的价格
	 */
	public double calcPrice(double booksPrice);
}
