package offer;

class test11 {
    public int NumberOf1(int n) {
    	int result = 0;
    	while(n!=0){
    		result++;
    		n = (n-1) & n;
    	}
    	return result;
    }
    public static void main(String[] args) {
    	test11 t = new test11();
    	//System.out.println(~-16);
    	int i = t.NumberOf1(-16);
    	System.out.println(i);
	}
}
