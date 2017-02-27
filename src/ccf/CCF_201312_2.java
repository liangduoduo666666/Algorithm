package ccf;
import java.util.Scanner;

public class CCF_201312_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringBuffer sb = new StringBuffer(input);
		sb.deleteCharAt(1);
		sb.deleteCharAt(4);
		sb.deleteCharAt(9);
		int result = 0 ;
		for(int i = 0 ; i < 9 ; i++){
			result += (sb.charAt(i)-'0')*(i+1);
		}
		result %= 11;
		if(result==10){
			if('X'==sb.charAt(9)){
				System.out.println("Right");
			}else{
				System.out.println(input.substring(0, 12)+'X');
			}
		}else{
			if(result==(sb.charAt(9)-'0')){
				System.out.println("Right");
			}else{
				System.out.println(input.substring(0, 12)+result);
			}
		}
	}
}
