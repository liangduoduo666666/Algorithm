package offer;

import java.util.Arrays;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字， 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
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

		int i = start + length; // 前一个数组的最后一个下标
		int j = end; // 后一个数组的最后一个下标
		int indexCopy = end; // 用于复制的辅助数组的最后一个下标
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
