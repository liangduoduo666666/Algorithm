package offer;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @author zhouliang
 */
class test34 {
	//丑数是另一个丑数乘2,3,5得到的
    public static int GetUglyNumber_Solution(int index) {
    	if(index<=0){
    		return 0;
    	}
    	int[] uglyNums = new int[index];
    	int count = 1;
    	uglyNums[0] = 1;
    	int t2 = 0;//排在t2之前的每个丑数乘以2都小于已有的最大丑数
    	int t3 = 0;
    	int t5 = 0;
    	while(count<index){
    		int min = getMin(uglyNums[t2]*2,uglyNums[t3]*3,uglyNums[t5]*5);
    		uglyNums[count] = min;//当前排好序的最大丑数
    		while(uglyNums[t2]*2<=uglyNums[count]){
    			t2++;
    		}
    		while(uglyNums[t3]*3<=uglyNums[count]){
    			t3++;
    		}
    		while(uglyNums[t5]*5<=uglyNums[count]){
    			t5++;
    		}
    		count++;
    	}
        return uglyNums[index-1];
    }
    
    public static int getMin(int a, int b, int c){
    	int min = a>b? b:a;
    	min = min>c? c:min;
    	return min;
    }
    
    public static void main(String[] args) {
    	int i = GetUglyNumber_Solution(8);
    	System.out.println(i);
	}
}
