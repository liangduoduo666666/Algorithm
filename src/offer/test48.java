package offer;

/**
 * ��1+2+3+...+n�� Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 * 
 * @author zhouliang
 *
 */
class test48 {
	public int Sum_Solution(int n) {
		int sum = n;
		boolean flag = (sum > 0) && ((sum += Sum_Solution(--n)) > 0);
		return sum;
	}
}
