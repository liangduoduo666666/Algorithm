package niuke_sort;

import java.util.Random;

/**
 * ������
 * һ�㶼����������ʾ�ѣ�i���ĸ�����±��Ϊ(i �C 1) / 2��
 * ���������ӽ���±�ֱ�Ϊ2 * i + 1��2 * i + 2��
 * ���0����������ӽ���±�ֱ�Ϊ1��2��
 * @author zhouliang
 *
 */
class HeapSort {
	
	//�ݹ�ʵ��
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
    
    //�ѵ���
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
    
    //�ǵݹ�ʵ��
    public void headSort1(int a[] ,int n){
    	int i,j,h,k;
    	
    	//��a[0,n-1]���ɴ���ѣ����һ�����ն�Ԫ�ص��±���[n/2]����ȡ����
    	//����ɸѡֻ��Ҫ�ӵ�[n/2]����ȡ����Ԫ�ؿ�ʼ���Ӻ���ǰ���е�����
    	for(i=n/2; i>=0; i--){ 
    		while(2*i+1 < n){  //��i���ڵ���������
    			j = 2 * i + 1; //����
    			if((j+1)<n){ //��i�������������
    				if(a[j] < a[j+1]){ //������С��������������Ҫ�Ƚ�������
    					j++;         //��ż�1��ָ��������
    				}
    			}
    			if(a[i] < a[j]){    //������ӽ������򽻻���a[j]ָ���������һ�����ӽ�㣩
    				swap(a,i,j); 
    				i = j; //�ѱ��ƻ�����Ҫ���µ���
    			}else{
    				break;  //�Ƚ������ӽڵ�������δ�ƻ�������Ҫ����
    			}
    		}
    	}
    	System.out.println("ԭ���ݹ��ɵĶѣ�");
    	for(h=0;h<n;h++){
    		System.out.print(" "+a[h]);
    	}
    	System.out.println();
    	//������
    	for(i=n-1; i>0; i--){
    		swap(a,0,i);     //��0�����i������
    		k = 0;
    		while(2*k+1 < i){  //��k�������������
    			j = 2*k+1;
    			if((j+1)<i){
    				if(a[j]<a[j+1]){ //������С��������������Ҫ�Ƚ�������
    					j++;  //��ż�1��ָ��������
    				}
    			}
    			if(a[k]<a[j]){  //�Ƚϵ�k���������ĺ��ӽ��
    				swap(a,k,j); //��������
    				k = j;//�ѱ��ƻ�����Ҫ���µ���
    			}else{
    				break; //�Ƚ����������������ڶ���δ�ƻ�
    			}
    		}
    		System.out.println("��"+(n-i)+"����������");
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
    	System.out.println("---------�ݹ������---------");
    	h.headSort1(nums,10);*/
    	
    	System.out.println("---------�ǵݹ������---------");
    	h.heapSort2(nums, nums.length);
    	for(int i=0; i<10; i++){
    		System.out.print(nums[i]+" ");
    	}
	}
}
