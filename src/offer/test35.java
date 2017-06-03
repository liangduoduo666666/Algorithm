package offer;

/**
 * ��һ���ַ���(1<=�ַ�������<=10000��
 * ȫ���ɴ�д��ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
 * @author zhouliang
 *
 */
class test35 {
    public static int FirstNotRepeatingChar(String str) {
    	if(str==null || str.length()==0){
    		return -1;
    	}
    	int[] nums = new int[256];
    	for(int i=0; i<str.length(); i++){
    		nums[str.charAt(i)]++;
    	}
    	for(int i=0; i<str.length(); i++){
    		if(nums[str.charAt(i)]==1){
    			return i;
    		}
    	}
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("1356373516"));
	}
}
