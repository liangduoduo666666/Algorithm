package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
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
