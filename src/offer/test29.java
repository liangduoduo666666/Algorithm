package offer;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2��
 * ��������������0��
 * @author zhouliang
 *
 */
class test29 {
    public int MoreThanHalfNum_Solution(int [] array) {
    	if(array.length<=0 || array==null){
    		return 0;
    	}
    	int mid = array.length >> 1;
    	int start = 0;
    	int end = array.length-1;
    	int index = partition(array, start, end);
    	while(index!=mid){
    		if(index>mid){
    			end = index-1;
    			index = partition(array,start,end);
    		}else{
    			start = index+1;
    			index = partition(array,start,end);
    		}
    	}
    	
    	int result = array[mid];
    	int times = 0;
    	for(int i=0; i<array.length ;i++){
    		if(array[i]==result){
    			times++;
    		}
    	}
    	if(times*2>array.length){
    		return result;
    	}else{
    		return 0;
    	}
    }
    
    public int partition(int[] array, int start ,int end){
    	int mid = array[start];
    	while(start<end){
    		while(start<end && array[end]>=mid){
    			end--;
    		}
    		array[start] = array[end];
    		
    		while(start<end && array[start]<=mid){
    			start++;
    		}
    		array[end] = array[start];
    	}
    	array[start] = mid;
    	return start;
    }
    
    public static void main(String[] args) {
    	test29 t= new test29();
    	int[] array = {1,2,3,2,4,2,5,2,3};
    	int result = t.MoreThanHalfNum_Solution(array);
    	System.out.println(result);
	}
}
