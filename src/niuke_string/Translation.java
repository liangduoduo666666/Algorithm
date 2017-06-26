package niuke_string;

/**
 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。
给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。
测试样例：
"ABCDE",5,3
返回："DEABC"
 * @author zhouliang
 *
 */
class Translation {
    public static String stringTranslation(String A, int n, int len) {
        // write code here
    	char[] chars = A.toCharArray();
    	reverse(chars,0,len-1);
    	reverse(chars,len,n-1);
    	reverse(chars,0,n-1);
    	return new String(chars);
    }
    
    public static void reverse(char[] chars, int begin , int end){
    	while(begin<end){
    		char temp = chars[begin];
    		chars[begin] = chars[end];
    		chars[end] = temp;
    		begin++;
    		end--;
    	}
    }
    
    public static void main(String[] args) {
    	String s = "ABCDE";
    	char[] chars = s.toCharArray();
    	reverse(chars,0,3);
    	System.out.println(new String(chars));
	}
}
