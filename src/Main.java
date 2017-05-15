
public class Main {
	public static void main(String[] args) {
		System.out.println(fun1(5));
	}
	public static int fun1(int n){
		if(n==1){
			return 1;
		}else{
			return fun2(n)+fun1(n-1);
		}
	}
	public static int fun2(int n){
		if(n==1){
			return 1;
		}else{
			return fun2(n-1)*n;
		}
	}
	
	
}
