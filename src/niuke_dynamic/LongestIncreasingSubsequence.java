package niuke_dynamic;

/**
 * 
����һ�������LIS(�������������)���⣬�����һ�������ŵĽⷨ������е�����������еĳ��ȡ�
����һ������A�����ĳ���n(����С�ڵ���500)���뷵��LIS�ĳ��ȡ�
����������
[1,4,2,5,3],5
���أ�3
 * @author zhouliang
 *
 */
class LongestIncreasingSubsequence {
    public static int getLIS(int[] A, int n) {
        // write code here
    	int[] dp = new int[n];
    	dp[0] = 1;
    	for(int i=1; i<n; i++){
    		int max = 0;
    		 for(int j=0; j<i; j++){
    			 if(A[j]<A[i] && dp[j]>max){
    				 max = dp[j];
    			 }
    		 }
    		 dp[i] = max+1;
    	}
    	int max = -1;
    	for(int i=0; i<n; i++){
    		if(dp[i]>max){
    			max = dp[i];
    		}
    	}
    	return max;
    }
    
    public static void main(String[] args) {
    	int[] A = {1,4,2,5,6};
    	int i = getLIS(A,5);
    	System.out.println(i);
	}
}
