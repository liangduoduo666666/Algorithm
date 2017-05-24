package offer;

import java.util.Stack;

/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * @author zhouliang
 *
 */
class test21 {
	
	Stack<Integer> nums = new Stack<Integer>();
	Stack<Integer> mins = new Stack<Integer>();
	
    public void push(int node) {
        nums.push(node);
        if(mins.isEmpty()){
        	mins.push(node);
        }else{
        	if(node<mins.peek()){
        		mins.push(node);
        	}
        }
    }
    
    public void pop() {
        int temp = nums.pop();
        if(temp == mins.peek()){
        	mins.pop();
        }
    }
    
    public int top() {
        return nums.peek();
    }
    
    public int min() {
        return mins.peek();
    }
}
