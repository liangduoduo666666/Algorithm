package offer;

class test9 {
    public int JumpFloorII(int target) {
    	if(target <= 0){
    		return -1;
    	}
    	if(target == 1){
    		return target;
    	}else{
    		return 2*JumpFloorII(target-1);
    	}
    }
    
    public static void main(String[] args) {
    	test9 t = new test9();
    	int i = t.JumpFloorII(4);
    	System.out.println(i);
	}
}
