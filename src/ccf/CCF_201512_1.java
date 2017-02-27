package ccf;
import java.util.Scanner;

public class CCF_201512_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		int result = 0;
		while(input>0){
			result+=input%10;
			input=input/10;
		}
		System.out.println(result);
	}
}
