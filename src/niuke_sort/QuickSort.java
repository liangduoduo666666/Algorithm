package niuke_sort;

/**
 * 快速排序
 * @author zhouliang
 *
 */
class QuickSort {
	public static void main(String[] args) {
        int[] array = { 18, 13, 7, 6, 21, 14, 32, 2, 1};  
        queckSort(array,0,array.length-1);
        for(int i = 0 ; i < array.length ; i++){
        	System.out.print(array[i]+" ");
        }
	}
	//分治递归
    public static void queckSort(int[] array , int start , int end){
    	if(start >= end){
    		return;
    	}else{
    		int mid = partition(array, start, end);
    		queckSort(array, start, mid);
    		queckSort(array, mid + 1, end);
    	}
    }
    
    public static int partition(int[] array , int start , int end ){
    	
    	//挖第一个坑，把坑里的数取出来存在mid中
    	int mid = array[start];
    	
    	while(start < end){
    		//如何右边的数大于mid，则往左边移动
    		while(array[end]>=mid && end>start){
    			end--;
    		}
    		/*
    		跳出上面的循环说明右边有一个小于mid的数，
    		把这个数填到左边的坑里,(array[start]一开始赋值给了mid，挖了一个坑),
    		并在右边留下一个坑array[end]
    		*/
    		array[start] = array[end];
    		
    		//如何左边的数小于mid，则往左边移动
    		while(array[start]<=mid && end>start){
    			start++;
    		}
    		/*
    		跳出上面的循环说明左边有一个大于mid的数，
    		把这个数填到右边的坑里(array[end]是上一步array[start] = array[end]挖的坑)
    		并在左边留下一个坑array[start]
    		*/
    		array[end] = array[start];
    	}
    	//最后把mid填到剩下的一个坑里
    	array[start] = mid;
    	//返回这个坑的下标
    	return start;
    }
}
