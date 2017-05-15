package niuke_sort;

/**
 * ��������
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
	//���εݹ�
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
    	
    	//�ڵ�һ���ӣ��ѿ������ȡ��������mid��
    	int mid = array[start];
    	
    	while(start < end){
    		//����ұߵ�������mid����������ƶ�
    		while(array[end]>=mid && end>start){
    			end--;
    		}
    		/*
    		���������ѭ��˵���ұ���һ��С��mid������
    		����������ߵĿ���,(array[start]һ��ʼ��ֵ����mid������һ����),
    		�����ұ�����һ����array[end]
    		*/
    		array[start] = array[end];
    		
    		//�����ߵ���С��mid����������ƶ�
    		while(array[start]<=mid && end>start){
    			start++;
    		}
    		/*
    		���������ѭ��˵�������һ������mid������
    		���������ұߵĿ���(array[end]����һ��array[start] = array[end]�ڵĿ�)
    		�����������һ����array[start]
    		*/
    		array[end] = array[start];
    	}
    	//����mid�ʣ�µ�һ������
    	array[start] = mid;
    	//��������ӵ��±�
    	return start;
    }
}
