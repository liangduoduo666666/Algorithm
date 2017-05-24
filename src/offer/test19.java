package offer;

class test19 {
	public static void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		changeLeftRight(root);
		if (root.left != null) {
			Mirror(root.left);
		}

		if (root.right != null) {
			Mirror(root.right);
		}
	}

	public static void changeLeftRight(TreeNode node) {
		System.out.println(node.val);
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(6);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(10);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(11);

		Mirror(root);
	}
}
