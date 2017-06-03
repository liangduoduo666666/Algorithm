package offer;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 
 * @author zhouliang
 *
 */
class test40 {
	private  boolean flag = true;
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null) {
			return false;
		}
		if(getTreeDept(root)==-1){
			return false;
		}
		return flag;
	}

	public int getTreeDept(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = getTreeDept(root.left) ;
		int right = getTreeDept(root.right) ;
		int temp = left - right;
		if (Math.abs(temp)>1) {
			flag = false;
			return -1;
		}
		return left > right ? (left + 1) : (right + 1);
	}
	
	public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		test40 t1 = new  test40();
		System.out.println(t1.IsBalanced_Solution(t));
	}
}
