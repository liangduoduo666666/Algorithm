package niuke_sort;

/**
 * ц╟ещеепР
 * @author zhouliang
 *
 */
class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        // write code here
    	for(int i=0; i<A.length; i++){
    		for(int j=0; j<A.length-i-1; j++){
    			int temp = -1;
    			if(A[j]>A[j+1]){
    				temp = A[j];
    				A[j] = A[j+1];
    				A[j+1] = temp; 
    			}
    		}
    	}
    	return A;
    }
    public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int[] A = {2,3,6,7,15,13,5};
		b.bubbleSort(A,A.length);
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
}
