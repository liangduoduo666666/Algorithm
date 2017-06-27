package niuke_string;

/**
请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，
并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
测试样例：
"Mr John Smith”,13
返回："Mr%20John%20Smith"
”Hello  World”,12
返回：”Hello%20%20World”
 * @author zhouliang
 */
class Replacement {
    public static  String replaceSpace(String iniString, int length) {
        // write code here
    	char[] chars = iniString.toCharArray();
    	int num = 0;
    	for(int i=0; i<length; i++){
    		if(chars[i]==' '){
    			num++;
    		}
    	}
    	int l = length+num*2;
    	char[] result = new char[l];
    	for(int i=length-1,j=l-1; i>=0; i--){
    		if(chars[i]==' '){
    			result[j--]='0';
    			result[j--]='2';
    			result[j--]='%';
    		}else{
    			result[j--]=chars[i];
    		}
    	}
    	return new String(result);
    }
    
    public static void main(String[] args) {
		System.out.println(replaceSpace("Mr John Smith",13));
	}
}
