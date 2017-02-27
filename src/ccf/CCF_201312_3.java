package ccf;
import java.util.Scanner;

public class CCF_201312_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0 ;
		int[] result = new int[N];
		int max = 0;
		int min = 10001;
		while(index<N){
			int temp = scan.nextInt();
			if(temp>max){
				max = temp;
			}
			if(temp<min){
				min = temp;
			}
			result[index] = temp ;
			index++;
		}
		int maxresult = 0; 
		for(int i = 2 ; i < N-1 ; i++){
			for(int j = 0 ; j+i <= N ;j++){
				int tempmin = judge(result,j,i);
				if(i*tempmin>maxresult){
						maxresult = i*tempmin;
				}	
			}
		}
		max = Math.max(max, min*N);
		if(max>maxresult){
			System.out.println(max);
		}else{
			System.out.println(maxresult);
		}
		scan.close();
	}
	public  static int  judge(int[] result ,int start , int size ){
		int min = 10001 ;
		for(int x = start ; x < start+size ; x++){
			if(result[x]<min){
				min = result[x];
			}
		}
		return min;
	}
}
