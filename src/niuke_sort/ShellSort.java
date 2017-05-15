package niuke_sort;

import java.util.Random;

/**
 * 希尔排序
 * @Author zhouliAng
 *
 */
class ShellSort {
	public int[] shellsort(int A[], int n)  
	{  
	    int i, j, gap;  
	  
	    for (gap = n / 2; gap > 0; gap /= 2) //步长  
	        for (i = 0; i < gap; i++)        //直接插入排序  
	        {  
	            for (j = i + gap; j < n; j += gap)   
	                if (A[j] < A[j - gap])  
	                {  
	                    int temp = A[j];  //取当前下标
	                    int k = j - gap;  //取有序部分的最后一个结点
	                    while (k >= 0 && A[k] > temp)  //比较有序部分的最大值（最后一个即是最大值）
	                    {  	            
	                        A[k + gap] = A[k]; //将有序部分的值后移
	                        k -= gap;  //往前面的有序结点移动，继续比较（每个结点相隔gap）
	                    }  
	                    A[k + gap] = temp;  
	                }  
	        }  
	    return A;
	} 
	
    public static void main(String[] args) {
    	ShellSort s = new ShellSort();
    	int[] nums = new int[10];
    	for(int i=0; i<10; i++){
    		Random r = new Random();
    		nums[i] = r.nextInt(100);
    	}
    	for(int i=0; i<10; i++){
    		System.out.print(nums[i]+" ");
    	}
    	System.out.println();
    	System.out.println("---------递归堆排序---------");
    	s.shellsort(nums, 10);
    	    	for(int i=0; i<10; i++){
    		System.out.print(nums[i]+" ");
    	}
	}
}
