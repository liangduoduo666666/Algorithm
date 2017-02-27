package ccf;
import java.util.Scanner;

public class CCF_201612_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		int index = 0;
		while(index<N){
			array[index] = scan.nextInt();
			index++;
		}
		int max = 0;
		int temp;
		for(int i = 1 ; i< N ; i++){
			temp = Math.abs(array[i]-array[i-1]);
			if(temp>max){
				max = temp;
			}
		}
		System.out.println(max);
	}
}
