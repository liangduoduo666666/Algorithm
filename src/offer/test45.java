package offer;

/**
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 * ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
 * ��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * @author zhouliang
 *
 */
class test45 {
    public static String ReverseSentence(String str) {
    	if(str==null || str.length()==0){
    		return "";
    	}
    	char[] chars = str.toCharArray();
    	reverse(chars, 0 ,chars.length-1);

    	for(int i=0; i< chars.length; i++){
        	int begin = i;
        	int end = i;
    		while( end<chars.length && chars[i]!=' '){
    			end++;
    			i++;
    		}
    		reverse(chars,begin,end-1);
    	}
        return String.valueOf(chars);
    }
    
    public static void reverse(char[] chars, int begin, int end){
    	while(begin < end){
    		char temp = chars[end];
    		chars[end] = chars[begin];
    		chars[begin] = temp;
    		
    		begin++;
    		end--;
    	}
    }
    
    public static void main(String[] args) {
		System.out.println(ReverseSentence("student. a am I"));
	}
}
