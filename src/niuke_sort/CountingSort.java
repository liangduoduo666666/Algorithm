package niuke_sort;

/**
 * 计数排序
 * @author zhouliang
 *
 */
class CountingSort {
    public int[] countingSort(int[] A, int n) {
        count(A);
        return A;
    }
 
    public static void count(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        int[] countArr = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
        	//countArr[i]的值为i，就表示i+min出现过i次
            while (countArr[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }
    
    public static void main(String[] args) {
    	CountingSort b = new CountingSort();
		int[] A = {2,3,6,7,15,13,5,18,4,7,9,25,14};
		b.countingSort(A,A.length);
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
}
