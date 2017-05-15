package niuke_dynamic;

class Violence {
	public static void main(String[] args) {
		Violence v = new Violence();
		int[] input = {5,10,1};
		long begin = 0;
		long end = 0;
		int result = 0;
/*		begin = System.currentTimeMillis(); 
		result = v.coin1(input, 2000);
		end = System.currentTimeMillis(); 
		System.out.println(result);
		System.out.println("暴力方法 "+(end - begin));*/
		
/*		begin = System.currentTimeMillis(); 
		result = v.coin2(input, 1000);
		end = System.currentTimeMillis(); 
		System.out.println(result);
		System.out.println("记忆方法 "+(end - begin));*/
		
		begin = System.currentTimeMillis(); 
		result = v.countWays(input, input.length, 10);
		end = System.currentTimeMillis(); 
		System.out.println(result);
		System.out.println("动态规划方法 "+(end - begin));
	}
	public int coin1(int[] arr, int aim){
		if(arr==null || arr.length==0 || aim<0){
			return 0;
		}
		return process1(arr, 0, aim);
	}
	
	//从arr数组的第i种开始，计算有多少种方法返回aim
	public int process1(int[] arr, int index, int aim){
		int res = 0;
		if(index == arr.length){
			res = aim==0 ? 1:0;
		}else{
			for(int i=0; arr[index]*i<=aim; i++){
				res += process1(arr, index+1, aim-arr[index]*i);
			}
		}
		return res;
	}
	
	public int coin2(int[] arr, int aim){
		if(arr==null || arr.length==0 || aim<0){
			return 0;
		}
		int[][] map = new int[arr.length+1][aim+1];
		return process2(arr, 0, aim, map);
	}
	
	
	//从arr数组的第i种开始，计算有多少种方法返回aim，map中存放从下标i开始兑换剩余钱数的方法数
	public int process2(int[] arr, int index, int aim, int[][] map){
		int res = 0;
		if(index == arr.length){
			res = aim==0 ? 1:0;
		}else{	
			for(int i=0; arr[index]*i<=aim; i++){
				int mapValue = map[index+1][aim-arr[index]*i];
				if(mapValue != 0){
					res += mapValue==-1 ? 0:mapValue;
				}else{
					res += process2(arr, index+1, aim-arr[index]*i, map);
				}
			}
		}
		map[index][aim] = res==0 ? -1:res;
		return res;
	}
	
	//给定数组penny及它的大小(小于等于50)，同时给定一个整数aim，请返回有多少种方法可以凑成aim。
    public int coin3(int[] penny, int n, int aim) {
        int[] dp = new int[aim+1];
        for(int i = 0;i <= aim;i++)
            if(i % penny[0] == 0)
                dp[i] = 1;
             
        for(int i = 1;i<n; i++)
            for(int j = 1;j<=aim;j++)
                if(j>=penny[i])
                    dp[j] += dp[j-penny[i]];
         
        return dp[aim];
    }
    
    
    //d[i][j]是使用arr[0...i]组成钱数j的方法数，d[i][j] = d[i-1][j]+d[i][j-penny[i]]
    public int countWays(int[] penny, int n, int aim) {
        // write code here
        if(0 == n || null == penny)
            return 0;
        int[][] dp = new int[n][aim + 1];
        for(int i = 0 ; i < aim + 1 ; i ++){
            dp[0][i] = i % penny[0] == 0 ? 1 : 0;
        }
        for(int i = 1 ; i < n ; i ++){
            for(int j = 0 ; j < aim + 1 ; j ++){
                if(j < penny[i]){
                	//j<penny[i]时，d[i][j-penny[i]]不存在
                    dp[i][j] = dp[i - 1][j];
                }else{
                	dp[i][j] = dp[i][j - penny[i]] + dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][aim];
    } 
}
