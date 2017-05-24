package offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author zhouliang
 *
 */
class test23 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (root == null) {
			return result;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			result.add(temp.val);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		return result;
    }
}
