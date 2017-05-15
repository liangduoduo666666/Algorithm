package offer;

class test7 {
	public int Fibonacci(int n) {
		int f = 0, g = 1;
		while(n>0){
			g = g + f; //F(n-1)
			f = g - f; //F(n-2)
			n--;
		}
		return f;
	}
	public static void main(String[] args) {
		test7 t  = new test7();
		int i = t.Fibonacci(55555555);
		System.out.println(i);
	}
}
