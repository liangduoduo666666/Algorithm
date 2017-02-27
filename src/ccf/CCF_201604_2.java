package ccf;
import java.util.Scanner;

public class CCF_201604_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] nums = new int[15][10];
		for(int i = 0 ; i < 15 ; i++){
			for(int j = 0 ; j < 10 ; j++){
				nums[i][j] = scan.nextInt();
			}
		}
		int[][] model = new int[4][4];
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				model[i][j] = scan.nextInt();
			}
		}
		int N = scan.nextInt();
		
		N = change(N,model);
		int x = 0 ;
		int[][] results;
		boolean flag = true;
		while(flag){
			int[][] temp=new int[4][4];
			for(int i = 11-x , m=0; i <=14-x ; i++,m++){
				for(int j = N-1,n=0 ; j < N-1+4;j++,n++){
					temp[m][n] = nums[i][j];
				}
			}
			results= judge(temp,model);
			if(results!=null){
				for(int i = 11-x , m=0; i <=14-x ; i++,m++){
					for(int j = N-1,n=0 ; j < N-1+4;j++,n++){
						if(results[m][n]==1){
							nums[i][j]=1;
						}
					}
				}
				flag=false;
			}
			x++;
		}
		for(int i = 0 ; i < 15 ; i++){
			for(int j = 0 ; j < 10 ; j++){
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int change(int N , int[][] model){
		int qiansuo = 0;
		int housuo = 0;
		for(int i = 0 ; i < 4 ;i++){
			if(housuo!=0){
				break;
			}
			boolean flag = false;
			for(int j = 0 ; j<4;j++){
				if(model[j][i]==1){
					flag = true;				
					housuo = 1;
					break;
				}
			}
			if(!flag){
				qiansuo++;
			}
		}
		int xx = 0;
		int yy =0;
		for(int i = 3 ; i >=0 ;i--){	
			if(yy!=0){
				break;
			}
			boolean flag = false;
			for(int j = 0 ; j<4 ;j++){
				if(model[i][j]==1){
					flag = true;
					yy = 1;
					break;
				}
			}	
			if(!flag){
				xx++;
			}
		}
		
		if(qiansuo!=0){
			N+=qiansuo;
			for(int i = 0 ; i< 4;i++){
				for(int j = 0 ; j <4 ;j++){
					if(model[i][j]==1){
						model[i][j]=0;
						model[i][j-qiansuo]=1;
					}
				}
			}

		}
		if(xx!=0){	
			for(int i = 3 ; i>=0;i--){
				for(int j = 0 ; j <4 ;j++){
					if(model[i][j]==1){
						model[i][j]=0;
						model[i+xx][j]=1;
					}
				}
			}
		}
		
		return N;
	}
	public static int[][] judge(int[][] nums1 , int[][] nums2){
		boolean flag = true;
		for(int i = 0 ; i < 4 ;i++){
			for(int j = 0 ; j < 4 ;j++){
				if(nums1[i][j]==nums2[i][j]&&nums1[i][j]==1){
					flag = false;
				}
			}
		}
		if(flag){
			for(int i = 0 ; i < 4 ;i++){
				for(int j = 0 ; j < 4 ;j++){
					if(nums2[i][j]==1){
						nums1[i][j]=1;
					}
				}
			}
			return nums1;
		}else{
			return null;
		}
	}
	
}
