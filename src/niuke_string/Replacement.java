package niuke_string;

/**
���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ���
����֪���ַ�������ʵ����(С�ڵ���1000)��ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�
����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��
����������
"Mr John Smith��,13
���أ�"Mr%20John%20Smith"
��Hello  World��,12
���أ���Hello%20%20World��
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
