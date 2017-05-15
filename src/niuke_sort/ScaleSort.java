package niuke_sort;

import java.util.Arrays;

/**
��֪һ��������������飬����������ָ������������ź�˳��Ļ���ÿ��Ԫ���ƶ��ľ�����Բ�����k��
����k�����������˵�Ƚ�С����ѡ��һ�����ʵ������㷨���������ݽ�������
����һ��int����A��ͬʱ����A�Ĵ�Сn�������е�k���뷵�����������顣
 * @author zhouliang
 *
 */
class ScaleSort {
    
    public int[] sortElement(int[] A, int n, int k) {
        if (n == 0 || n < k)
            return A;
        int[] heap = Arrays.copyOf(A, k);
  
        //���Ѳ���
        for (int i = k / 2 - 1; i >= 0; i--) {
            // i��������Ԫ�أ�len ������,��ֹ��Ԫ��Խ��
            heapAdjust(heap, i, k);
        }
  
        //��i �� n-1��ʱ�򣬺��滹ʣ�� ������k ����ĩβ��k ��Ԫ��û������
        //��Ҫ�ں����������,���ｫA[0]-A[n-k-1]����
        for(int i=k;i<n;i++){
            A[i-k] = heap[0];
            heap[0] = A[i];
            heapAdjust(heap, 0, k);
        }
          
        //��n-1-k+1��ʼ����
        //���ʣһ�����ˣ�������ͨ�Ķ�����˼���������
        //ÿ�������һ��Ԫ�غ�0λ�ý�����
        for(int i=n-k;i<n;i++){
            A[i] = heap[0];//heap[0] ��Ȼ����С��
          
            int temp = heap[0];
            heap[0] = heap[k-1];
            heap[k-1] = temp;
            heapAdjust(heap, 0, --k);//k�ĳ��Ȳ��ϼ�С
        }
        return A;
  
    }
      
    //����ΪС����
    private void heapAdjust(int[] heap, int parent, int len) {
         int child = 2*parent+1;
            while(child<len){
                //��� if �ж�ע��һ�£�������Ԫ�ز���Խ��
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
