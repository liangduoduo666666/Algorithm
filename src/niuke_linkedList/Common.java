package niuke_linkedList;

import java.util.ArrayList;

/**
�����������������������о����ظ�Ԫ�ء������һ����Ч���㷨����ӡ��������Ĺ���ֵ���֡�
�������������ͷָ��headA��headB���뷵��һ��vector��Ԫ��Ϊ��������Ĺ������֡�
�뱣֤����������������������Ԫ�ظ�����С�ڵ���500����֤һ���й���ֵ
����������
{1,2,3,4,5,6,7},{2,4,6,8,10}
���أ�[2.4.6]
 * @author zhouliang
 *
 */
class Common {
    public int[] findCommonParts(ListNode headA, ListNode headB) {
        // write code here
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	while(headA!=null && headB!=null){
    		if(headA.val == headB.val){
    			list.add(headA.val);
        		headA = headA.next;
        		headB = headB.next;
    		}else if(headA.val < headB.val){
    			headA = headA.next;
    		}else if(headA.val > headB.val){
    			headB = headB.next;
    		}
    	}
    	int[] result = new int[list.size()];
    	for(int i=0; i<list.size(); i++){
    		result[i] = list.get(i);
    	}
    	return result;
    }
    
}
