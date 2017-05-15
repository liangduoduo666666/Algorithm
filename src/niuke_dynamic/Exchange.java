package niuke_dynamic;

class Exchange {
    public int countWays(int[] penny, int n, int aim) {
        // write code here
    	int result = 0;
    	result = coins(penny, 0, aim);
    	return result;
    }
    
    public int coins(int[] penny, int index, int aim){

    	int result = 0;
    	if(index == penny.length){
    		if(aim==0){
    			result = 1;
    		}else{
    			result = 0;
    		}
    	}else{
/*    		for(int i=0; i*penny[index]<=aim; i++){
    			result += coins(penny,index+1,aim-i*penny[index]);
    		}*/
    		for(int i=0; i<=aim; i+=penny[index]){
    			result += coins(penny, index+1, aim-i);
    		}
    	}
    	return result;
    }
    
    
    public int countWays2(int[] penny, int n, int aim) {
        // write code here
    	int result = 0;
    	int[][] map = new int[n+1][aim+1];
    	result = coins2(penny, 0, aim ,map);
    	return result;
    }
    
    public int coins2(int[] penny, int index, int aim, int[][] map){
    	int result = 0;
    	if(index == penny.length){
    		if(aim == 0){
    			result = 1;
    		}else{
    			result = 0;
    		}
    	}else{
    		for(int i=0; i*penny[index]<=aim; i++){
    			int mapValue = map[index+1][aim-penny[index]*i];
    			if(mapValue!=0){
    				if(mapValue==-1){
    					result +=0;
    				}else{
    					result +=mapValue;
    				}
    			}else{
        			result += coins2(penny, index+1, aim-penny[index]*i, map);
    			}
    		}
    	}
    	if(result == 0){
        	map[index][aim] = -1;
    	}else{
        	map[index][aim] = result;
    	}
    	return result;
    }
    
    public int countWays3(int[] penny, int n, int aim) {
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
                	//j<penny[i]Ê±£¬d[i][j-penny[i]]²»´æÔÚ
                    dp[i][j] = dp[i - 1][j];
                }else{
                	dp[i][j] = dp[i][j - penny[i]] + dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][aim];
    } 
    
    public static void main(String[] args) {
    	Exchange e = new Exchange();
    	int[] input = {2,3,4};
    	int result = e.countWays3(input, input.length, 20);
    	System.out.println(result);
	}
}
