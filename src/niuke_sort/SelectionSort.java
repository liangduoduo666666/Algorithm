package niuke_sort;

/**
 * —°‘Ò≈≈–Ú
 * @author zhouliang
 *
 */
class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
    	int temp;
    	for(int i=0; i<A.length; i++){
    		int min = i;
    		for(int j=i; j<A.length; j++){
    			if(A[min]>A[j]){
    				temp = A[min];
    				A[min] = A[j];
    				A[j] = temp;
    			}
    		}
    	}
    	return A;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort b = new SelectionSort();
		int[] A = {20,3,17,7,15,13,5};
		b.selectionSort(A,A.length);
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}
	}

}
