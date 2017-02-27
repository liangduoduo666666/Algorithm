package ccf;

import java.util.Scanner;

public class CCF_201612_2 {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		int index = 0;
		while(index<N){
			array[index] = scan.nextInt();
			index++;
		}
		scan.close();
		int[][] result = new int[20][1];
		for(int i = 0 ; i<N ;i++){
			boolean flag = false;
			for(int j = 0 ; j<result.length ; j++){
				if(array[i]<=(5-result[j][0])){
					flag = true;
					int temp =  result[j][0];
					result[j][0]+=array[i];
					for(int n = temp ; n < result[j][0];n++){
						if(n==result[j][0]-1){
							System.out.println((j*5+n+1));
						}else{
							System.out.print((j*5+n+1)+" ");
						}
					}
					break;
				}
			}
			
			if(!flag){
				int temp = array[i];
                for (int m = 0; m < result.length; m++) {
                   int res = 5-result[m][0];    
                   while(temp>=res&&res>0)
                   {
                	   int k =result[m][0]; 
                       result[m][0]=k+1;
                       System.out.print(m*5+k+1+" ");
                       temp--;  
                       res--;
                   }
                   if(temp==0)
                   break;
                }
			}
		}
	}
}
