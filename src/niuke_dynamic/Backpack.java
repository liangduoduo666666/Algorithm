package niuke_dynamic;

/**
 һ��������һ���ĳ���cap����N����Ʒ��ÿ�������Լ��ļ�ֵ����¼������v�У�
 Ҳ�����Լ�����������¼������w�У�ÿ����Ʒֻ��ѡ��Ҫװ�뱳�����ǲ�װ�뱳����
 Ҫ���ڲ������������ص�ǰ���£�ѡ����Ʒ���ܼ�ֵ���
������Ʒ������w��ֵv����Ʒ��n�ͳ���cap���뷵������ܼ�ֵ��
����������
[1,2,3],[1,2,3],3,6
���أ�6
 * @author zhouliang
 *
 */
class Backpack {
    public static int maxValue(int[] w, int[] v, int n, int cap) {
        // write code here
        // dp[x][y]��ʾ��Ʒ����Ϊx,����������yʱ�����е��ܼ�ֵ
        //���������1.��x��Ʒ�����뵽�����У���ôǰx-1����Ʒ����������Ӧ�ó���y��dp[x][y] = dp[x-1][y]
                //2.��x��Ʒ���뵽�����У���ôǰx-1����Ʒ����������Ӧ�ó���y-w(x),���dp[x][y] = dp[x-1][y-w(x)]+v(x);
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
