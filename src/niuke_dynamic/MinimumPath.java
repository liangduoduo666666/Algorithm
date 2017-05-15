package niuke_dynamic;

/**
��һ������map����ÿ��������һ��Ȩֵ�������Ͻǵĸ��ӿ�ʼÿ��ֻ�����һ��������ߣ���󵽴����½ǵ�λ�ã�
·�������е������ۼ���������·���ͣ��������е�·������С��·���͡�
����һ������map����������n������m���뷵����С·���͡���֤��������С�ڵ���100.
����������
[[1,2,3],[1,1,1]],2,3
���أ�4
 * @author zhouliang
 *
 */
class MinimumPath {
    public static int getMin(int[][] map, int n, int m) {
        // write code here
    	int[][] dp = new int[n][m];
    	dp[0][0] = map[0][0];
    	for(int i=1; i<m; i++){
    		dp[0][i] = dp[0][i-1]+map[0][i];
    	}
    	for(int i=1; i<n; i++){
    		dp[i][0] = dp[i-1][0]+map[i][0];
    	}
    	
    	for(int i=1; i<n; i++){
    		for(int j=1; j<m; j++){
    			if(dp[i-1][j]>dp[i][j-1]){
    				dp[i][j] = dp[i][j-1] + map[i][j];
    			}else{
    				dp[i][j] = dp[i-1][j] + map[i][j];
    			}	
    		}
    	}
    	return dp[n-1][m-1];
    }
    
    public static void main(String[] args) {
		int[][] map = {{1,2,3},{1,0,1},{1,4,6}};
		int result = getMin(map,3,3);
		System.out.println(result);
	}
}
