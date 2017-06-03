package offer;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 
 * @author zhouliang
 *
 */
class test38 {
	public int GetNumberOfK(int[] array, int k) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int result = 0;
		int first = getFirstK(array, 0, array.length - 1, k);
		int last = getLastK(array, 0, array.length - 1, k);
		if (first != -1 && last != -1) {
			result = last - first + 1;
		}
		return result;
	}

	public int getFirstK(int[] array, int start, int end, int k) {
		if (start > end) {
			return -1;
		}
		int mid = (end + start) / 2;
		if (array[mid] == k) {
			if (mid == 0 || (mid > 0 && array[mid - 1] != k)) {
				return mid;
			} else {
				end = mid - 1;
			}
		}
		if (array[mid] > k) {
			end = mid - 1;
		}
		if (array[mid] < k) {
			start = mid + 1;
		}
		return getFirstK(array, start, end, k);
	}

	public int getLastK(int[] array, int start, int end, int k) {
		if (start > end) {
			return -1;
		}
		int mid = (end + start) / 2;
		if (array[mid] == k) {
			if (mid == array.length - 1 || (mid > 0 && array[mid + 1] != k)) {
				return mid;
			} else {
				start = mid + 1;
			}
		}
		if (array[mid] > k) {
			end = mid - 1;
		}
		if (array[mid] < k) {
			start = mid + 1;
		}
		return getLastK(array, start, end, k);
	}

	public static void main(String[] args) {
		test38 t = new test38();
		int[] array = { 3, 3, 3, 3, 4, 5 };
		System.out.println(t.GetNumberOfK(array, 3));
	}
}
