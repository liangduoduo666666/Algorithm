package niuke_string;

import java.util.Arrays;
import java.util.Comparator;

/**
����һ���������ַ������飬���ҵ�һ��ƴ��˳��ʹ����С�ַ���ƴ�ӳɵĴ��ַ��������п��ܵ�ƴ�����ֵ�����С�ġ�
����һ���ַ�������strs��ͬʱ�������Ĵ�С���뷵��ƴ�ӳɵĴ���
����������
["abc","de"],2
"abcde"
 * @author zhouliang
 *
 */
class Prior {
    public static String findSmallest(String[] strs, int n) {
        // write code here
    	Arrays.sort(strs, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1+o2;
				String s2 = o2+o1;
				return s1.compareTo(s2);
			}
    		
		});
    	String result = "";
    	for(int i=0; i<n; i++){
    		result += strs[i];
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	String[] strs = {"abc","de"};
    	System.out.println(findSmallest(strs,2));
	}
}
