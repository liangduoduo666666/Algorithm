package offer;

import java.util.Arrays;

/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣� ���������������һ������ԡ�����һ������,�����������е�����Ե�����P��
 * ����P��1000000007ȡģ�Ľ������� �����P%1000000007
 * 
 * @author zhouliang
 *
 */
class test36 {
	public static int InversePairs(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int[] copy = Arrays.copyOf(array, array.length);
		//int[] copy = new int[array.length];
		int count = InversePairs(array, copy, 0, array.length - 1);
		return count;
	}

	public static int InversePairs(int[] array, int[] copy, int start, int end) {
		if (start == end) {
			copy[start] = array[start];
			return 0;
		}
		int length = (end - start) / 2;
		int left = InversePairs(copy, array, start, start + length);
		int right = InversePairs(copy, array, start + length + 1, end);

		int i = start + length; // ǰһ����������һ���±�
		int j = end; // ��һ����������һ���±�
		int indexCopy = end; // ���ڸ��Ƶĸ�����������һ���±�
		int count = 0;
		while (i >= start && j >= start + length + 1) {
			if (array[i] > array[j]) {
				copy[indexCopy--] = array[i--];
				count += j - start - length;
				if (count >= 1000000007) {
					count %= 1000000007;
				}
			} else {
				copy[indexCopy--] = array[j--];
			}
		}

		for (; i >= start; --i) {
			copy[indexCopy--] = array[i];
		}
		for (; j >= start + length + 1; --j) {
			copy[indexCopy--] = array[j];
		}
		return (left + right + count) % 1000000007;
	}

	public static void main(String[] args) {
		int[] array = { 7, 5, 6, 4 };
		System.out.println(InversePairs(array));
	}
}
