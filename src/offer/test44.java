package offer;


/**
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 * @author zhouliang
 *
 */
class test44 {
    public static String LeftRotateString(String str,int n) {
    	if(str==null || str==""){
    		return "";
    	}
    	if(n>str.length() || n<0){
    		return "";
    	}
    	str = str.substring(n,str.length())+str.substring(0, n);
        return str;
    }
    
    public static void main(String[] args) {
		System.out.println(LeftRotateString(null,6));
	}
}
