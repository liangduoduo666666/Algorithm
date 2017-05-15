package niuke_dynamic;

/**
 一个背包有一定的承重cap，有N件物品，每件都有自己的价值，记录在数组v中，
 也都有自己的重量，记录在数组w中，每件物品只能选择要装入背包还是不装入背包，
 要求在不超过背包承重的前提下，选出物品的总价值最大。
给定物品的重量w价值v及物品数n和承重cap。请返回最大总价值。
测试样例：
[1,2,3],[1,2,3],3,6
返回：6
 * @author zhouliang
 *
 */
class Backpack {
    public static int maxValue(int[] w, int[] v, int n, int cap) {
        // write code here
        // dp[x][y]表示物品数量为x,重量不超过y时背包中的总价值
        //两种情况：1.将x物品不加入到背包中，那么前x-1件物品的总重量不应该超过y。dp[x][y] = dp[x-1][y]
                //2.将x物品加入到背包中，那么前x-1个物品的总重量不应该超过y-w(x),因此dp[x][y] = dp[x-1][y-w(x)]+v(x);
    	int[][] dp = new int[n][cap+1];
    	for(int i=0; i<=cap; i++){
    		if(w[0]<=i){
    			dp[0][i] = v[0];
    		}
    	}
    	for(int i=1; i<n; i++){
    		for(int j=1; j<=cap; j++){
                if(j-w[i]>=0){
                	if(dp[i-1][j] < dp[i-1][j-w[i]]+v[i]){                	
                		dp[i][j] = dp[i-1][j-w[i]]+v[i];
                	}
                }else{
                    dp[i][j]=dp[i-1][j];
                }
    		}
    	}
    	
    	return dp[n-1][cap];
    }
    
    public static void main(String[] args) {
		int[] w = {1,2,3};
		int[] v = {1,2,3};
		int result =  maxValue(w,v,3,6);
		System.out.println(result);
	}
}
