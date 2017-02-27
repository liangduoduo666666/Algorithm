package ccf;
import java.util.Scanner;

public class CCF_201604_2Again {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int[] c={14,14,14,14},d={-20,-20,-20,-20};
	    int i,j,s;
		int[][] a = new int[15][10];
		for(i = 0 ; i < 15 ; i++){
			for(j = 0 ; j < 10 ; j++){
				a[i][j] = scan.nextInt();
			}
		}
		int[][] b = new int[4][4];
		for( i = 0 ; i < 4 ; i++){
			for( j = 0 ; j < 4 ; j++){
				b[i][j] = scan.nextInt();
			}
		}
		s = scan.nextInt();
		
	    s=s-1;
	    for(i=s;i<s+4;i++)
	    for(j=0;j<15;j++){
	        if(a[j][i]==1){
	            c[i-s]=j-1;
	            break;
	        }
	    }
	    for(i=0;i<4;i++){
	        for(j=0;j<4;j++){
	            if(b[j][i]==1)
	            d[i]=j; 
	        }
	    }
	    int minl=15;
	    for(i=0;i<4;i++)
	    if(c[i]-d[i]<minl){
	        minl=c[i]-d[i];
	    }
	    for(i=0;i<4;i++)
	    for(j=0;j<4;j++){
	        if(b[i][j]==1)
	        a[minl+i][s+j]=b[i][j];
	    }
	    
		for( i = 0 ; i < 15 ; i++){
			for(j = 0 ; j < 10 ; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
