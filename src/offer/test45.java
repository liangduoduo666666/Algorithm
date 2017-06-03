package offer;

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
