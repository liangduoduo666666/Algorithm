package offer;

import java.util.ArrayList;

class test30 {

	public static void main(String[] args) {
    	int[] nums = {4,5,1,6,2,7,2,8};
    	test30 t  =  new test30();
    	ArrayList<Integer> result = t.GetLeastNumbers_Solution(nums, 2);
    	for(int i=0; i<result.size(); i++){
    		System.out.print(result.get(i)+" ");
    	}
	}
	
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	for(int i=k/2-1; i>=0; i--){
    		heapAdjust(input, i, k);
    	}
    	
    	for(int j=k; j<input.length; j++){
    		if(input[0] > input[j]){
    			swap(input, 0, j);
    			heapAdjust(input, 0, k);
    		}
    	}
    	
    	for(int x=0; x<k; x++){
    		result.add(input[x]);
    	}
        return result;
    }

    public  void heapAdjust(int[] array, int index, int length){
    	int temp = array[index];
    	for(int j=2*index+1; j<length; j=2*j+1){
    		if(j<length-1 && array[j]<array[j+1]){
    			j++;
    		}
    		if(temp > array[j]){
    			break;
    		}
    		array[index] = array[j];
    		index = j;
    	}
    	array[index] = temp;
    }
    
     void  swap(int[] A,int m,int n){
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}
