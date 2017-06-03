package offer;

/**
 * ��ֻ��������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ����������7�� 
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * @author zhouliang
 */
class test34 {
	//��������һ��������2,3,5�õ���
    public static int GetUglyNumber_Solution(int index) {
    	if(index<=0){
    		return 0;
    	}
    	int[] uglyNums = new int[index];
    	int count = 1;
    	uglyNums[0] = 1;
    	int t2 = 0;//����t2֮ǰ��ÿ����������2��С�����е�������
    	int t3 = 0;
    	int t5 = 0;
    	while(count<index){
    		int min = getMin(uglyNums[t2]*2,uglyNums[t3]*3,uglyNums[t5]*5);
    		uglyNums[count] = min;//��ǰ�ź����������
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
