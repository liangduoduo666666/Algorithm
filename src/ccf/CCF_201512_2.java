package ccf;
import java.util.Scanner;

public class CCF_201512_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] result = new int[n][m];
		for(int i = 0 ; i < n ;i++){
			for(int j = 0 ; j < m ; j++){
				result[i][j]=scan.nextInt();
			}
		}
		int[][] mark = new int[n][m];
		for(int i = 0 ; i < n ;i++){
			int flag=1;
			for(int j = 1 ; j < m ; j++){
				if(result[i][j]==result[i][j-1]){
					flag++;
					if(flag>=3){
						int index = 0;
						while(index<flag){
							mark[i][j-index]=-1;
							index++;
						}
					}
				}else{
					flag=1;
				}
			}
		}
		
		for(int i = 0 ; i < n ;i++){
			int flag=1;
			for(int j = 1 ; j < m ; j++){
				if(result[i][j]==result[i][j-1]){
					flag++;
					if(flag>=3){
						int index = 0;
						while(index<flag){
							mark[i][j-index]=-1;
							index++;
						}
					}
				}else{
					flag=1;
				}
			}
		}
		
		for(int j = 0 ; j < m ;j++){
			int flag=1;
			for(int i = 1 ; i < n ; i++){
				if(result[i][j]==result[i-1][j]){
					flag++;
					if(flag>=3){
						int index = 0;
						while(index<flag){
							mark[i-index][j]=-1;
							index++;
						}
					}
				}else{
					flag=1;
				}
			}
		}
		
		for(int i = 0 ; i < n ;i++){
			for(int j = 0 ; j < m ; j++){
				if(mark[i][j]==-1){
					result[i][j]=0;
				}
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
