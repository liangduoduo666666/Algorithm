package offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� 
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 * @author zhouliang
 *
 */
class test28 {
	private ArrayList<String> result = new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
    	if(str!=null && str.length()>0){
    		Permutation(str.toCharArray(),0);
    		Collections.sort(result);
    	}	
        return result;
    }
    public void Permutation(char[] chars, int begin){
    	if(begin == chars.length-1){
    		String temp = String.valueOf(chars);
    		result.add(temp);
    	}else{
    		for(int i=begin; i<chars.length; i++){
    			if(i==begin || chars[i]!=chars[begin]){
        			char temp = chars[i];
        			chars[i] = chars[begin];
        			chars[begin] = temp;
        			
        			Permutation(chars, begin+1);
        			
        			temp = chars[i];
        			chars[i] = chars[begin];
        			chars[begin] = temp;
    			}
    		}
    	}
    }
    
    public static void main(String[] args) {
    	test28 t = new test28();
    	ArrayList<String> result = t.Permutation("abc");
    	for(int i=0; i<result.size() ;i++){
    		System.out.println(result.get(i));
    	}
	}
}
