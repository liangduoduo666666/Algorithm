package offer;

/**
 * ����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·����
 * �·���ĳ���Ϊ������ȡ�
 * @author zhouliang
 *
 */
class test39 {
    public int TreeDepth(TreeNode root) {
    	if(root==null){
    		return 0;
    	}
    	int left = TreeDepth(root.left)+1;
    	int right = TreeDepth(root.right)+1;
        return left>right? (left+1):(right+1);
    }
}
