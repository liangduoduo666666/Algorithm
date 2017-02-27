
public class QuickSort1 {
	public static void main(String[] args) {
        int[] array = { 18, 13, 7, 6, 21, 14, 32, 2, 1};  
        sort(array,0,array.length-1);
        for(int i = 0 ; i < array.length ; i++){
        	System.out.print(array[i]+" ");
        }
	}
	public static void sort(int[] array, int start ,int end){
		if(start>=end){
			return;
		}
		int mid = partition(array,start,end);
		sort(array,start,mid-1);
		sort(array,mid+1,end);
	}
	public static int partition(int[] array , int start , int end ){
		int mid = array[start];
		while(start<end){
			while(array[end]>mid&&end>start){
				end--;
			}
			array[start] = array[end];
			while(array[start]<mid&&start<end){
				start++;
			}
			array[end] = array[start];
		}
		array[start] = mid;
		return start;
	}
}
