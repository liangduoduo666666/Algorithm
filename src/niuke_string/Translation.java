package niuke_string;

/**
 ����һ���ַ����������һ���㷨�����ַ����ĳ���Ϊlen��ǰ׺ƽ�Ƶ��ַ��������
����һ���ַ���A�����ĳ��ȣ�ͬʱ����len���뷵��ƽ�ƺ���ַ�����
����������
"ABCDE",5,3
���أ�"DEABC"
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
