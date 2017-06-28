package niuke_stack_queue;

import java.util.Stack;

/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * @author zhouliang
 *
 */
class Solution {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
    public void push(int node) {
        stack.push(node);
        if(minStack.isEmpty()){
        	minStack.push(node);
        }else{
        	if(node<minStack.peek()){
        		minStack.push(node);
        	}
        }
    }
    
    public void pop() {
        int temp = stack.pop();
        if(temp==minStack.peek()){
        	minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	s.push(3);
    	s.push(3);
    	System.out.println(s.min());
	}
}
