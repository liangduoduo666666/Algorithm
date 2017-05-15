package offer;

class test8 {
    public int JumpFloor(int target) {
    	if(target <= 2){
    		return target;
    	}else{
    		return JumpFloor(target-1)+JumpFloor(target-2);
    	}
    }
    
    public static void main(String[] args) {
    	test8 t = new test8();
    	int i = t.JumpFloor(4);
    	System.out.println(i);
	}
}
