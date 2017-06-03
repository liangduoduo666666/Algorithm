package offer;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数， 打印出二叉树中结点值的和为输入整数的所有路径。 
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 
 * @author zhouliang
 *
 */
class test25 {

	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null){
			return listAll;
		}
		list.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			listAll.add(new ArrayList<Integer>(list));
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		list.remove(list.size() - 1);
		return listAll;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		TreeNode temp1 = new TreeNode(5);
		TreeNode temp2 = new TreeNode(12);
		TreeNode temp3 = new TreeNode(4);
		TreeNode temp4 = new TreeNode(7);
		root.left = temp1;
		root.right = temp2;
		temp1.left = temp3;
		temp1.right = temp4;
		test25 t = new test25();
		ArrayList<ArrayList<Integer>> result = t.FindPath(root,22);
		System.out.println(result.size());
	}
	
}
