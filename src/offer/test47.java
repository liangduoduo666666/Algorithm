package offer;

import java.util.LinkedList;

/**
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����, ����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ�� Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
 * ��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,
 * �����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)�� ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 * 
 * @author zhouliang
 *
 */
class test47 {
	public static int LastRemaining_Solution(int n, int m) {
		if (n == 0 && m == 0) {
			return -1;
		}
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		int index = 1;
		while (list.size() > 1) {
			int current = list.poll();
			if (index % m != 0) {
				list.add(current);
			}
			index++;
		}
		return list.poll();
	}

	public static int LastRemaining_Solution1(int n, int m) {
		if (n < 1 && m < 1) {
			return -1;
		}
		int last = 0;
		for (int i = 2; i <= n; i++) {
			last = (last + m) % i;
		}
		return last;
	}

	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(5, 3));
	}
}
