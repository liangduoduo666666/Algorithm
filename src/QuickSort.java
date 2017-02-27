
public class QuickSort {
	public static void main(String[] args) {
        int[] array = { 18, 13, 7, 6, 21, 14, 32, 2, 1};  
     
        quickSort(array,0,array.length-1);    
        for(int i = 0 ; i < array.length ; i++){
        	System.out.print(array[i]+" ");
        }
	}
	public static void quickSort(int[] array ,int start ,int end){
		if(start>=end){
			return;
		}
		int mid = partition(array,start,end);
		quickSort(array,start,mid-1);
		quickSort(array,mid+1,end);
	}
	
	public static int partition(int[] array ,int start ,int end){
		int key = array[start];
		while(start<end){
			while(array[end]>key&&end>start){
				end--;
			}
			array[start]=array[end];
			while(array[start]<key&&start<end){
				start++;
			}
			array[end]=array[start];
		}
		array[end]=key;
		return end;
	}
}
