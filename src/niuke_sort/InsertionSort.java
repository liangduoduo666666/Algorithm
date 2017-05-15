package niuke_sort;

/**
 * ≤Â»Î≈≈–Ú
 * @author zhouliang
 *
 */
class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
    	for(int i=1; i<A.length; i++){
    		if(A[i-1]>A[i]){
    			int temp = A[i];
    			int j = i;
    			while(j>0&&A[j-1]>temp){
    				A[j]=A[j-1];
    				j--;
    			}
    			A[j] = temp;
    		}
    	}
    	return A;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort b = new InsertionSort();
		int[] A = {20,3,17,7,15,13,5};
		b.insertionSort(A,A.length);
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
}
