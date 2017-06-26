package niuke_string;

/**
����һ���ַ����������һ���㷨��ֻ���ַ����ĵ��ʼ������������Ҳ����˵��
�ַ�����һЩ�ɿո�ָ��Ĳ�����ɣ�����Ҫ����Щ��������
����һ��ԭ�ַ���A�����ĳ��ȣ��뷵���������ַ�����
����������
"dog loves pig",13
���أ�"pig loves dog"
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
