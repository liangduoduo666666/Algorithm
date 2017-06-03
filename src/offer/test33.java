package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
 * @author zhouliang
 *
 */
class test33 {
    public static String PrintMinNumber(int [] numbers) {
    	if(numbers==null || numbers.length==0){
    		return "";
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i<numbers.length; i++){
    		list.add(numbers[i]);
    	}
    	Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String str1 = o1+ "" +o2;
				String str2 = o2+ "" + o1;	    		
				return str1.compareTo(str2);
			}
		});
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<list.size(); i++){
    		sb.append(list.get(i));
    	}
    	return sb.toString();
    }
    
    public static void main(String[] args) {
		int[] array = {3,5,1,4,2};
		System.out.println(PrintMinNumber(array));
	}
}
