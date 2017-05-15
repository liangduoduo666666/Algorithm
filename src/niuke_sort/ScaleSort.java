package niuke_sort;

import java.util.Arrays;

/**
已知一个几乎有序的数组，几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离可以不超过k，
并且k相对于数组来说比较小。请选择一个合适的排序算法针对这个数据进行排序。
给定一个int数组A，同时给定A的大小n和题意中的k，请返回排序后的数组。
 * @author zhouliang
 *
 */
class ScaleSort {
    
    public int[] sortElement(int[] A, int n, int k) {
        if (n == 0 || n < k)
            return A;
        int[] heap = Arrays.copyOf(A, k);
  
        //建堆操作
        for (int i = k / 2 - 1; i >= 0; i--) {
            // i用于找子元素，len 代表长度,防止子元素越界
            heapAdjust(heap, i, k);
        }
  
        //当i 到 n-1的时候，后面还剩下 倒数第k 个到末尾这k 个元素没有排序
        //需要在后面继续排序,这里将A[0]-A[n-k-1]排序
        for(int i=k;i<n;i++){
            A[i-k] = heap[0];
            heap[0] = A[i];
            heapAdjust(heap, 0, k);
        }
          
        //从n-1-k+1开始排序
        //最后剩一个堆了，就是普通的堆排序思想往外输出
        //每次拿最后一个元素和0位置交换。
        for(int i=n-k;i<n;i++){
            A[i] = heap[0];//heap[0] 仍然是最小数
          
            int temp = heap[0];
            heap[0] = heap[k-1];
            heap[k-1] = temp;
            heapAdjust(heap, 0, --k);//k的长度不断减小
        }
        return A;
  
    }
      
    //调整为小顶堆
    private void heapAdjust(int[] heap, int parent, int len) {
         int child = 2*parent+1;
            while(child<len){
                //这个 if 判断注意一下，首先子元素不能越界
                if((child+1)<len && heap[child]>heap[child+1]){
                    child = child+1;
                }
                  
                if(heap[parent]<heap[child]){
                    break;
                }else{
                    int temp = heap[parent];
                    heap[parent] = heap[child];
                    heap[child] = temp;
                }
                parent = child;
                child = 2*parent+1;
            }
    }
}
