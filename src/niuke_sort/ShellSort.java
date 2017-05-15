package niuke_sort;

import java.util.Random;

/**
 * ϣ������
 * @Author zhouliAng
 *
 */
class ShellSort {
	public int[] shellsort(int A[], int n)  
	{  
	    int i, j, gap;  
	  
	    for (gap = n / 2; gap > 0; gap /= 2) //����  
	        for (i = 0; i < gap; i++)        //ֱ�Ӳ�������  
	        {  
	            for (j = i + gap; j < n; j += gap)   
	                if (A[j] < A[j - gap])  
	                {  
	                    int temp = A[j];  //ȡ��ǰ�±�
	                    int k = j - gap;  //ȡ���򲿷ֵ����һ�����
	                    while (k >= 0 && A[k] > temp)  //�Ƚ����򲿷ֵ����ֵ�����һ���������ֵ��
	                    {  	            
	                        A[k + gap] = A[k]; //�����򲿷ֵ�ֵ����
	                        k -= gap;  //��ǰ����������ƶ��������Ƚϣ�ÿ��������gap��
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
    	System.out.println("---------�ݹ������---------");
    	s.shellsort(nums, 10);
    	    	for(int i=0; i<10; i++){
    		System.out.print(nums[i]+" ");
    	}
	}
}
