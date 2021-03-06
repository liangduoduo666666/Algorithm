package offer;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你
 * 会不会被他忽悠住？(子向量的长度至少是1)
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
