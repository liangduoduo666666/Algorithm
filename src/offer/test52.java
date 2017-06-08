package offer;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * 
 * @author zhouliang
 *
 */
class test52 {
	// B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
	// 从左到右算 B[i]=A[0]*A[1]*...*A[i-1]
	// 从右到左算B[i]*=A[i+1]*...*A[n-1]
	public static int[] multiply(int[] A) {
		int[] result = new int[A.length];
		if (A != null && A.length > 1) {
			result[0] = 1;

			for (int i = 1; i < A.length; i++) {
				result[i] = result[i - 1] * A[i - 1];
			}

			int temp = 1;
			for (int i = A.length - 2; i >= 0; i--) {
				temp *= A[i + 1];
				result[i] *= temp;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, 4 };
		System.out.println(multiply(A));
	}
}
