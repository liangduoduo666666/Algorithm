package niuke_sort;

/**
 * 

�������һ���ַ���A����A��ǰ������һ����Ų�����ȥ�γɵ��ַ�����ΪA����ת�ʡ�����A="12345",A����ת����"12345","23451","34512","45123"��"51234"�����������ַ���A��B�����ж�A��B�Ƿ�Ϊ��ת�ʡ�

���������ַ���A��B�����ǵĳ���lena��lenb���뷵��һ��boolֵ�����������Ƿ�Ϊ��ת�ʡ�
����������

"cdab",4,"abcd",4

���أ�true


 * @author zhouliang
 *
 */
class Rotation {
    public static boolean isRotate(String str1,String str2){
    	if(str1.length()!=str2.length()){
    		return false;
    	}else{
    		str1+=str1;
    		if(str1.contains(str2)){
    			return true;
    		}else{
    			return false;
    		}
    	}
    }
    public static void main(String[] args) {
		String str1= "12345";
		String str2= "23451";
		String str3= "12435";
		System.out.println(isRotate(str1,str2));
		System.out.println(isRotate(str1,str3));

	}
}
