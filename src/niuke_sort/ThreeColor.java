package niuke_sort;

/**
 *
有一个只由0，1，2三种元素构成的整数数组，请使用交换、原地排序而不是使用计数进行排序。
给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。保证数组大小小于等于500。
测试样例：
[0,1,1,0,2,2],6
返回：[0,0,1,1,2,2]
 * @author zhouliang
 *
 */
class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
        int left = -1, right = n;
        int index = 0;
        while(index < n && index<right){
        	if(A[index] == 0){
        		if(A[left+1]!=0){
        			swap(A, left+1, index);
        		} 
        		left++;
        		index++;
        	}else if(A[index] == 2){
        		if(A[right-1]!=2){
        			swap(A, right-1, index);
        		}	
        		right--;
        	}else{
        		index++;
        	}
        }
        return A;
    }
    
    public void swap(int[] A, int i, int j){
    	int temp = A[i];
    	A[i] = A[j];
    	A[j] = temp;
    }
	public static void main(String[] args) {
		ThreeColor t = new ThreeColor();
		int[] A = {0,1,1,0,2,2};
		int[] result = t.sortThreeColor(A, A.length);
		for(int i : result){
			System.out.println(i);
		}
	}

}
