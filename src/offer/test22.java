package offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author zhouliang
 *
 */
class test22 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	if(pushA.length!= popA.length){
    		return false;
    	}
    	Stack<Integer> nums = new Stack<Integer>();
    	int[] result = new int[pushA.length];
    	int index = 0;
    	for(int i=0; i<pushA.length; i++){
    		nums.push(pushA[i]);
    		while(!nums.isEmpty() && nums.peek()==popA[index] ){
    			result[index++] = nums.pop();   			
    		}
    		
    	}
    	boolean flag = true;
    	for(int i=0; i<pushA.length; i++){
    		if(result[i]!=popA[i]){
    			flag = false;
    		}
    	}
        return flag;
    }
    
    public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int[] B = {4,5,3,2,1};
		int[] C = {4,3,5,1,2};
		System.out.println(IsPopOrder(A,B));
		System.out.println(IsPopOrder(A,C));
	}
}
