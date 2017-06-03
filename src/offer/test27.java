package offer;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author zhouliang
 *
 */
class test27 {
    public static TreeNode Convert(TreeNode root) {
        // 用于保存处理过程中的双向链表的尾结点
        TreeNode[] lastNode = new TreeNode[1];
        convertNode(root, lastNode);
        // 找到双向链表的头结点
        TreeNode head = lastNode[0];
        while (head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }
    /**
     * 链表表转换操作
     *
     * @param node     当前的根结点
     * @param lastNode 已经处理好的双向链表的尾结点，使用一个长度为1的数组，类似C++中的二级指针
     */
    public static void convertNode(TreeNode node, TreeNode[] lastNode) {
        // 结点不为空
        if (node != null) {
            // 如果有左子树就先处理左子树
            if (node.left != null) {
                convertNode(node.left, lastNode);
            }
            // 将当前结点的前驱指向已经处理好的双向链表（由当前结点的左子树构成）的尾结点
            node.left = lastNode[0];
            // 如果左子树转换成的双向链表不为空，设置尾结点的后继
            if (lastNode[0] != null) {
                lastNode[0].right = node;
            }
            // 记录当前结点为尾结点
            lastNode[0] = node;
            // 处理右子树
            if (node.right != null) {
                convertNode(node.right, lastNode);
            }
        }
    }
}
