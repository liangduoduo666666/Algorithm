package offer;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
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
		//结点有右子树，则下一个结点是右子树中的最左子节点
		if(pNode.right != null){
			TreeLinkNode pRight = pNode.right;
			while(pRight.left != null){
				pRight = pRight.left;
			}
			pNext = pRight;
		}else if(pNode.next != null){	
			//如果结点没有右子树
			TreeLinkNode pCurrent = pNode;
			TreeLinkNode pParent = pNode.next;
			
			//结点是父节点的左子节点，则跳过while循环，下一个结点就是父节点
			while(pParent != null && pCurrent== pParent.right ){
				//向上查找一个是它父节点的左子节点的结点
				pCurrent = pParent;
				pParent = pParent.next;
			}
			pNext  = pParent;
		}
		return pNext;
	}
}
