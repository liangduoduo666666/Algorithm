package offer;

/**
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬
 * һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * @author zhouliang
 *
 */
class test26 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
        	return null;
        }
        RandomListNode pNode = pHead;
        while(pNode!=null){
        	RandomListNode temp = new RandomListNode(pNode.label);     	
        	RandomListNode next = pNode.next;       	
        	pNode.next = temp;     
        	temp.next = next;
        	pNode = next;
        }
        
        RandomListNode pRand = pHead;
        while(pRand!=null){
        	if(pRand.random!=null){
        		RandomListNode rand  = pRand.random;
            	pRand.next.random = rand.next;
        	}
        	pRand = pRand.next.next;
        }
        RandomListNode pCur = pHead;
        RandomListNode result = pHead.next;
        RandomListNode cur = result;
        while(pCur!=null){
    		pCur.next = pCur.next.next;
    		if(pCur.next!=null){
    			cur.next = cur.next.next;
    		}
    		cur = cur.next;
    		pCur = pCur.next;
        }
    	return result;
    }
}
