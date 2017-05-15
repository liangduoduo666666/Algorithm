package niuke_dynamic;

/**
 * 
���������ַ���A��B�����������ַ���������������еĳ��ȡ�
���磬A="1A2C3D4B56����B="B1D23CA45B6A������123456"����"12C4B6"��������������С�
���������ַ���A��B��ͬʱ�����������ĳ���n��m���뷵������������еĳ��ȡ���֤�������Ⱦ�С�ڵ���300��
����������
"1A2C3D4B56",10,"B1D23CA45B6A",12
���أ�6
 * @author zhouliang
 *
 */
class LCS {
    public static int findLCS(String A, int n, String B, int m) {
        // write code here
    	char[] charA = A.toCharArray();
    	char[] charB = B.toCharArray();
    	int[][] dp = new int[n][m];
    	if(charA[0]==charB[0]){
    		dp[0][0] = 1;
    	}
    	for(int i=1; i<n; i++){
    		if(charB[0]==charA[i] || dp[i-1][0]==1 ){
    			dp[i][0] = 1;
    		}
    	}
    	
    	for(int i=1; i<m; i++){
    		if(charA[0]==charB[i] || dp[0][i-1]==1 ){
    			dp[0][i] = 1;
    		}
    	}
    	
    	for(int i=1; i<n; i++){
    		for(int j=1; j<m; j++){
    			int left = dp[i-1][j];
    			int top = dp[i][j-1];
    			int prev = dp[i-1][j-1];
    			int temp = Math.max(left, top);    		
    			if(charA[i]==charB[j]){
        			dp[i][j] = prev + 1;
    			}else{
    				dp[i][j] = temp;
    			}
    		}
    	}
    	return dp[n-1][m-1];
    }
    
    public static void main(String[] args) {
    	String A = "1A2C3D4B56";
    	String B = "B1D23CA45B6A";
    	int i = findLCS(A,A.length(),B,B.length());
    	System.out.println(i);
	}
}
