package niuke_stack_queue;

import java.util.Arrays;
import java.util.Stack;

/**
��дһ����,ֻ��������ջ�ṹʵ�ֶ���,֧�ֶ��еĻ�������(push��pop)��
����һ����������ope�����ĳ���n������Ԫ��Ϊ��������push������Ϊ0����pop������
��֤�������кϷ���һ����pop�������뷵��pop�Ľ�����С�
����������
[1,2,3,0,4,0],6
���أ�[1,2]
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
