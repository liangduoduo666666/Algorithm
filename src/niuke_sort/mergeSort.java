package niuke_sort;

/**
 * 归并排序
 * @author zhouliang
 *
 */
class mergeSort {

	public int[] mergeSort(int[] A, int n) {
		// write code here
		sort(A, 0, n - 1);
		return A;
	}

	public void sort(int[] data, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			// 划分左右
			sort(data, left, middle);
			sort(data, middle + 1, right);
			// 合并左右
			merge(data, left, middle, right);
		}
	}

	// 合并左右两个子数组
	public void merge(int[] data, int left, int middle, int right) {
		// 临时数组
		int[] tempArr = new int[right - left + 1];
		// 左边数组游标
		int leftIndex = left;
		// 右边数据游标
		int rightIndex = middle + 1;
		// 临时数组游标
		int tempIndex = 0;

		while (leftIndex <= middle && rightIndex <= right) {
			// 临时数组选取左、右子数组中小数值
			if (data[leftIndex] < data[rightIndex]) {
				tempArr[tempIndex++] = data[leftIndex++];
			} else {
				tempArr[tempIndex++] = data[rightIndex++];
			}
		}
		// 剩余的直接放入
		while (leftIndex <= middle) {
			tempArr[tempIndex++] = data[leftIndex++];
		}
		// 剩余的直接放入
		while (rightIndex <= right) {
			tempArr[tempIndex++] = data[rightIndex++];
		}
		// 将临时数组放回原数组相应位置
		int temp = 0;
		while ((temp + left) <= right) {
			data[left + temp] = tempArr[temp];
			temp++;
		}
	}

	public static void main(String[] args) {
		int[] list = { 9, 1, 5, 3, 4, 2, 6, 7, 8 };
		mergeSort m = new mergeSort();
		m.mergeSort(list, list.length - 1);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
