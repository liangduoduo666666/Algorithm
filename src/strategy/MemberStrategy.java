package strategy;

//�����㷨�࣬��������֧�ֵ��㷨�Ĺ����ӿ�
public interface MemberStrategy {

	/**
	 * ����ͼ��ļ۸�
	 * @param booksPrice ͼ���ԭ��
	 * @return �ۿۺ�ļ۸�
	 */
	public double calcPrice(double booksPrice);
}
