package offer;

/**
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣 ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
 * 
 * @author zhouliang
 *
 */
class test63 {
	int index = 0;
	TreeNode KthNode(TreeNode pRoot, int k) {
		if(pRoot != null){
			TreeNode node = KthNode(pRoot.left , k);
			if(node!=null){
				return node;
			}
			index++;
			if(index == k){
				return pRoot;
			}
			node = KthNode(pRoot.right , k);
			if(node!=null){
				return node;
			}
		}
		return null;
	}
}
