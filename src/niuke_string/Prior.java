package niuke_string;

import java.util.Arrays;
import java.util.Comparator;

/**
对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
测试样例：
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
