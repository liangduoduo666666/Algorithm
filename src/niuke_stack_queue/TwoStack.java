package niuke_stack_queue;

import java.util.Arrays;
import java.util.Stack;

/**
编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，为0代表pop操作，
保证操作序列合法且一定含pop操作，请返回pop的结果序列。
测试样例：
[1,2,3,0,4,0],6
返回：[1,2]
 * @author zhouliang
 *
 */
class TwoStack {
	private Stack<Integer> pushStack = new Stack<Integer>();
	private Stack<Integer> popStack = new Stack<Integer>();
	
    public int[] twoStack(int[] ope, int n) {
        // write code here
    	int[] result = new int[n];
    	int num = 0;
    	for(int i=0; i<n; i++){
    		if(ope[i]!=0){
    			pushStack.push(ope[i]);
    		}else{   			
    			if(popStack.isEmpty()){
    				while(!pushStack.isEmpty()){
    					popStack.push(pushStack.pop());
    				}
    			}
    			result[num++] = popStack.pop();
    		}
    	}
    	return Arrays.copyOf(result, num);
    }
    
    public static void main(String[] args) {
    	TwoStack t = new TwoStack();
    	int[] input = {1,2,3,0,4,0};
    	int[] result = t.twoStack(input,6);
    	for(int i=0; i<result.length; i++){
    		System.out.println(result[i]);
    	}
	}
}
