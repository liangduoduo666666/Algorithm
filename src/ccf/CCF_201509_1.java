package ccf;
import java.util.Scanner;

public class CCF_201509_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int index = 0 ;
		int[] nums = new int[input];
		while(index<input){
			nums[index]=scan.nextInt();
			index++;
		}
		int count = 1;
		for(int i = 1 ; i < input ; i++){
			boolean flag = true;
			if(nums[i]==nums[i-1]){
				flag = false;
			}else{
				flag = true;
			}
			if(flag){
				count++;
			}
		}
		System.out.println(count);
	}
}
