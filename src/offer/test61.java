package offer;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 
 * @author zhouliang
 *
 */
class test61 {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null){
			return result;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
    	TreeNode last = pRoot;
    	TreeNode nlast = null ;
		queue.add(last);
		while(!queue.isEmpty()){
			TreeNode current = queue.poll();
			list.add(current.val);
			if(current.left!=null){
				queue.add(current.left);
				nlast = current.left;
			}
			if(current.right!=null){
				queue.add(current.right);
				nlast = current.right;
			}
    		if(current == last){
    			result.add(list);
    			last = nlast;
    			list = new ArrayList<Integer>();
    		}
		}
		return result;
	}
}
