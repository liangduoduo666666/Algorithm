package ccf;
import java.util.Scanner;

 class test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0 ;
		int[] a = new int[N];
		while(index<N){
			int temp = scan.nextInt();
			a[index] = temp ;
			index++;
		}
        int ans = -1;
        for(int i = 0 ; i< N;++i){
            int low = a[i];
            for(int j =  i ; j < N;++j){
                if(low > a[j])
                    low = a[j];
                int temp = (j - i + 1) * low;
                if(temp > ans)
                    ans = temp;
            }
        }
        System.out.println(ans);
	}
}
