package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
 * �ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 * @author zhouliang
 *
 */
class test60 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();
    	if(pRoot == null){
    		return result;
    	}
    	
    	Stack<TreeNode> stack1  = new Stack<TreeNode>();
    	Stack<TreeNode> stack2  = new Stack<TreeNode>();
    	stack1.push(pRoot);
    	int levels = 1;
    	while(!stack1.isEmpty() || !stack2.isEmpty()){
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		TreeNode current;
    		if(levels % 2 == 1){
    			while(!stack1.isEmpty()){
        			current = stack1.pop();
        			list.add(current.val);
        			if(current.left != null){
        				stack2.push(current.left);
        			}
        			if(current.right != null){
        				stack2.push(current.right);
        			}
    			}
    			if(!list.isEmpty()){
    				result.add(list);
    				levels++;
    			}
    		}else{
    			while(!stack2.isEmpty()){
        			current = stack2.pop();
        			list.add(current.val);
        			if(current.right != null){
        				stack1.push(current.right);
        			}
        			if(current.left != null){
        				stack1.push(current.left);
        			}
    			}
    			if(!list.isEmpty()){
    				result.add(list);
    				levels++;
    			}
    		}
    	}
    	return result;
    }
}
