package niuke_string;

/**
对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，
字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
给定一个原字符串A和他的长度，请返回逆序后的字符串。
测试样例：
"dog loves pig",13
返回："pig loves dog"
 * @author zhouliang
 *
 */
class Reverse {
    public static String reverseSentence(String A, int n) {
        // write code here
    	String temp = reverse(A.toCharArray(),0,A.length()-1);
    	int begin = 0;
    	int end = n-1;
    	char[] chars = temp.toCharArray();
    	for(int i=0; i<n; i++){
    		if(chars[i]==' '){
    			end = i-1;
    			reverse(chars,begin,end);
    			begin = i+1;
    		}
    	}
    	reverse(chars,begin,n-1);
    	return new String(chars);
    }
    
    public static String reverse(char[] chars, int begin , int end){
    	while(begin<end){
    		char temp = chars[begin];
    		chars[begin] = chars[end];
    		chars[end] = temp;
    		begin++;
    		end--;
    	}
    	return new String(chars);
    }
    
    public static void main(String[] args) {
    	String result = reverseSentence("dog loves pig",13);
    	System.out.println(result);
	}
}
