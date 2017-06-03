package offer;

/**
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
 * ������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����
 * �᲻�ᱻ������ס��(�������ĳ���������1)
 * @author zhouliang
 *
 */
class test31 {
    public static int FindGreatestSumOfSubArray(int[] array) {
    	if(array==null || array.length==0){
    		return -1;
    	}
    	int result = -1;
    	int tempSum = 0;
    	for(int i=0; i<array.length; i++){
    		tempSum += array[i];
    		if(tempSum>result){
    			result = tempSum;
    		}    		if(tempSum<0){
    			tempSum = 0;
    		}
    	}
        return result;
    }
    
    public static void main(String[] args) {
		int[] array = {-2,-8,-1,-5,-9};
		int i = FindGreatestSumOfSubArray(array);
		System.out.println(i);
	}
}
