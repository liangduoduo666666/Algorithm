package offer;

/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء� ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 * 
 * @author zhouliang
 *
 */
class test58 {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if(pNode == null){
			return null;
		}
		TreeLinkNode pNext = null;
		//�����������������һ��������������е������ӽڵ�
		if(pNode.right != null){
			TreeLinkNode pRight = pNode.right;
			while(pRight.left != null){
				pRight = pRight.left;
			}
			pNext = pRight;
		}else if(pNode.next != null){	
			//������û��������
			TreeLinkNode pCurrent = pNode;
			TreeLinkNode pParent = pNode.next;
			
			//����Ǹ��ڵ�����ӽڵ㣬������whileѭ������һ�������Ǹ��ڵ�
			while(pParent != null && pCurrent== pParent.right ){
				//���ϲ���һ���������ڵ�����ӽڵ�Ľ��
				pCurrent = pParent;
				pParent = pParent.next;
			}
			pNext  = pParent;
		}
		return pNext;
	}
}
