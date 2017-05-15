package offer;



class test15 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null || k<=0){
    		return null;
    	}
    	ListNode prev = head;
    	for(int i=0; i<k-1; i++){
    		if(prev.next!=null){
        		prev = prev.next;
    		}else{
    			return null;
    		}
    	}
    	ListNode now = head;
    	while( prev.next!=null ){
    		prev = prev.next;
    		now = now.next;
    	}    	
    	return now;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
