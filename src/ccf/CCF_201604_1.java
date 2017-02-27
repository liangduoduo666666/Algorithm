package ccf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCF_201604_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0 ;		
		int[] nums = new int[N];
		while(index<N){
			int n = scan.nextInt();
			nums[index] = n;
			index++;
		}
		int result = 0;
		for(int i = 1 ; i < N-1 ;i++){
			if(nums[i]>nums[i+1]&&nums[i]>nums[i-1]){
				result++;
			}else if(nums[i]<nums[i+1]&&nums[i]<nums[i-1]){
				result++;
			}
		}
		scan.close();
		System.out.println(result);
	}
}
