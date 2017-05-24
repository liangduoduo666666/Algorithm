package offer;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
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
