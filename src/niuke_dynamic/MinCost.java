package niuke_dynamic;

/**
 * 
���������ַ���A��B��������Ҫ���в��롢ɾ�����޸Ĳ�����A����ΪB����
����c0��c1��c2�ֱ�Ϊ���ֲ����Ĵ��ۣ������һ����Ч�㷨�������A����ΪB������Ҫ�����ٴ��ۡ�
���������ַ���A��B�������ǵĳ��Ⱥ����ֲ������ۣ��뷵�ؽ�A����ΪB������Ҫ����С���ۡ�
��֤�������Ⱦ�С�ڵ���300�������ִ���ֵ��С�ڵ���100��
����������
"abc",3,"adc",3,5,3,100
���أ�8
 * @author zhouliang
 *
 */
class MinCost {
    public int findMinCost(String A, int n, String B, int m, int c0, int c1, int c2) {
        // write code here
        //c0���룬c1ɾ����c2�޸�
    	//dp[i][j] = ��A[0...i-1]ת����B[0...j-1]�����ѵ���С����
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
