package niuke_sort;

import java.util.Random;

/**
 * 堆排序
 * 一般都用数组来表示堆，i结点的父结点下标就为(i – 1) / 2。
 * 它的左右子结点下标分别为2 * i + 1和2 * i + 2。
 * 如第0个结点左右子结点下标分别为1和2。
 * @author zhouliang
 *
 */
class HeapSort {
	
	//递归实现
    public int[] heapSort2(int[] A, int n) {
        // write code here
        for(int i = n / 2; i >= 0; i--) {
            heapAdjust(A, i, n);
        }
        for(int i = n - 1; i > 0; i--) {
            swap(A, 0, i);
            heapAdjust(A, 0, i);
        }
        return A;
    }
    
    //堆调整
    static void heapAdjust(int[] A, int index, int length) {
        int temp = A[index];
        for(int j = 2 * index + 1; j < length; j = j * 2 + 1) {
            if(j < length - 1 && A[j] < A[j+1]) j++;
            if(temp > A[j]) break;
            A[index] = A[j];
            index = j;
        }
        A[index] = temp;
    }
    
   
    static void  swap(int[] A,int m,int n){
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
    
    //非递归实现
    public void headSort1(int a[] ,int n){
    	int i,j,h,k;
    	
    	//将a[0,n-1]建成大根堆，最后一个非终端元素的下标是[n/2]向下取整，
    	//所以筛选只需要从第[n/2]向下取整个元素开始，从后往前进行调整。
    	for(i=n/2; i>=0; i--){ 
    		while(2*i+1 < n){  //第i个节点有左子树
    			j = 2 * i + 1; //左孩子
    			if((j+1)<n){ //第i个结点有右子树
    				if(a[j] < a[j+1]){ //左子树小于右子树，则需要比较右子树
    					j++;         //序号加1，指向右子树
    				}
    			}
    			if(a[i] < a[j]){    //如果孩子结点更大则交换（a[j]指向的是最大的一个孩子结点）
    				swap(a,i,j); 
    				i = j; //堆被破坏，需要重新调整
    			}else{
    				break;  //比较左右子节点均大则堆未破坏，不需要调整
    			}
    		}
    	}
    	System.out.println("原数据构成的堆：");
    	for(h=0;h<n;h++){
    		System.out.print(" "+a[h]);
    	}
    	System.out.println();
    	//堆排序
    	for(i=n-1; i>0; i--){
    		swap(a,0,i);     //第0个与第i个交换
    		k = 0;
    		while(2*k+1 < i){  //第k个结点有左子树
    			j = 2*k+1;
    			if((j+1)<i){
    				if(a[j]<a[j+1]){ //左子树小于右子树，则需要比较右子树
    					j++;  //序号加1，指向右子树
    				}
    			}
    			if(a[k]<a[j]){  //比较第k个结点和它的孩子结点
    				swap(a,k,j); //交换数据
    				k = j;//堆被破坏，需要重新调整
    			}else{
    				break; //比较左右子树结点均大于堆则未破坏
    			}
    		}
    		System.out.println("第"+(n-i)+"步排序结果：");
        	for(h=0;h<n;h++){
        		System.out.print(" "+a[h]);
        	}
        	System.out.println();
    	}
    }
    
    
    public static void main(String[] args) {
    	HeapSort h = new HeapSort();
    	int[] nums = {2,1,4,3,6,5,8,7,10,9,11};
/*    	System.out.println();
    	System.out.println("---------递归堆排序---------");
    	h.headSort1(nums,10);*/
    	
    	System.out.println("---------非递归堆排序---------");
    	h.heapSort2(nums, nums.length);
    	for(int i=0; i<10; i++){
    		System.out.print(nums[i]+" ");
    	}
	}
}
