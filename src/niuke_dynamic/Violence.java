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
		System.out.println("�������� "+(end - begin));*/
		
/*		begin = System.currentTimeMillis(); 
		result = v.coin2(input, 1000);
		end = System.currentTimeMillis(); 
		System.out.println(result);
		System.out.println("���䷽�� "+(end - begin));*/
		
		begin = System.currentTimeMillis(); 
		result = v.countWays(input, input.length, 10);
		end = System.currentTimeMillis(); 
		System.out.println(result);
		System.out.println("��̬�滮���� "+(end - begin));
	}
	public int coin1(int[] arr, int aim){
		if(arr==null || arr.length==0 || aim<0){
			return 0;
		}
		return process1(arr, 0, aim);
	}
	
	//��arr����ĵ�i�ֿ�ʼ�������ж����ַ�������aim
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
	
	
	//��arr����ĵ�i�ֿ�ʼ�������ж����ַ�������aim��map�д�Ŵ��±�i��ʼ�һ�ʣ��Ǯ���ķ�����
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
	
	//��������penny�����Ĵ�С(С�ڵ���50)��ͬʱ����һ������aim���뷵���ж����ַ������Դճ�aim��
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
    
    
    //d[i][j]��ʹ��arr[0...i]���Ǯ��j�ķ�������d[i][j] = d[i-1][j]+d[i][j-penny[i]]
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
                	//j<penny[i]ʱ��d[i][j-penny[i]]������
                    dp[i][j] = dp[i - 1][j];
                }else{
                	dp[i][j] = dp[i][j - penny[i]] + dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][aim];
    } 
}
