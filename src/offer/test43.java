package offer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author zhouliang
 *
 */
class test43 {
	//从数组两端开始求和比较，第一个和为S的就是乘积最小的
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if(array==null || array.length==0){
    		return result;
    	}
    	int small = 0;
    	int big = array.length-1;
    	int currentSum = array[small] + array[big];
    	while(small<big){
    		if(currentSum == sum){
    			result.add(array[small]);
    			result.add(array[big]);
    			return result;
    		}    		
    		while(currentSum > sum && small<big){
    			big--;
    			currentSum = array[small] + array[big];
    		}
    		small++;
    		currentSum = array[small] + array[big];
    	}
        return result;
    }
}
