package niuke_dynamic;

/**
 * 
对于两个字符串A和B，我们需要进行插入、删除和修改操作将A串变为B串，
定义c0，c1，c2分别为三种操作的代价，请设计一个高效算法，求出将A串变为B串所需要的最少代价。
给定两个字符串A和B，及它们的长度和三种操作代价，请返回将A串变为B串所需要的最小代价。
保证两串长度均小于等于300，且三种代价值均小于等于100。
测试样例：
"abc",3,"adc",3,5,3,100
返回：8
 * @author zhouliang
 *
 */
class MinCost {
    public int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        // write code here
        //c0插入，c1删除，c2修改
    	//dp[i][j] = 把A[0...i-1]转换成B[0...j-1]所花费的最小代价
        int[][]dp= new int[n+1][m+1];
        char[] chars1=A.toCharArray();
        char[] chars2=B.toCharArray();
        dp[0][0]=0;
        for(int i=1;i<=n;i++)
            dp[i][0]=i*c1;
        for(int i=1;i<=m;i++)
            dp[0][i]=i*c0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int tmp1=Integer.MAX_VALUE;
                int tmp2=Integer.MAX_VALUE;
                if(chars1[i-1]!=chars2[j-1])
                    tmp1=dp[i-1][j-1]+c2;
                else
                    tmp2=dp[i-1][j-1];
                int tmp3=Math.min(dp[i-1][j]+c1,dp[i][j-1]+c0);
                dp[i][j]=Math.min(tmp3,Math.min(tmp1,tmp2));                                 
            }
        }
        return dp[n][m];
    }
}
