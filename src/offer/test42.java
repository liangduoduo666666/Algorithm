package offer;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。
 * 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @author zhouliang
 *
 */
class test42 {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
    	if(sum<3){
    		return result;
    	}
    	int mid = (sum+1)/2;
    	int small = 1;
    	int big = 2;
    	int currentSum = small + big;
    	while(small < mid){
    		if(currentSum == sum){
    			ArrayList<Integer> list = new ArrayList<Integer>();
    			for(int i=small; i<=big; i++){
    				list.add(i);
    			}
    			result.add(list);
    		}
    		while(currentSum > sum && small<mid){
    			currentSum -= small;
    			small++;
    			if(currentSum == sum){
    				ArrayList<Integer> list = new ArrayList<Integer>();
        			for(int i=small; i<=big; i++){
        				list.add(i);
        			}
        			result.add(list);
    			}
    		}
    		big++;
			currentSum += big;
    	}
        return result;
    }
    
    public static void main(String[] args) {
		System.out.println(FindContinuousSequence(15).size());
	}
}
