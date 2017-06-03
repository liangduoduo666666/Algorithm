package offer;

/**
 * 在一个字符串(1<=字符串长度<=10000，
 * 全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置
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
