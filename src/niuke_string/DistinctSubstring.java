package niuke_string;

import java.util.HashMap;

/**
对于一个字符串,请设计一个高效算法，找到字符串的最长无重复字符的子串长度。
给定一个字符串A及它的长度n，请返回它的最长无重复字符子串长度。保证A中字符全部为小写英文字符，且长度小于等于500。
测试样例：
"aabcb",5
返回：3
 * @author zhouliang
 *
 */
class DistinctSubstring {
    public static int longestSubstring(String A, int n) {
        // write code here
    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	int pre = 0;
    	int indexA = -1;
    	int indexB = -1;
    	int result = 0;
    	for(int i=0; i<n; i++){
    		char temp = A.charAt(i);
    		if(map.containsKey(temp)){
        		indexA = map.get(temp)+1;
        		indexB = i - pre;
        		if(indexA > indexB){
        			pre = i-indexA+1;
        		}else {
        			pre++;
        		}
        		map.put(temp, i);
    		}else{
    			map.put(temp, i);
    			pre++;
    		}
    		
    		if(pre>result){
    			result = pre;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.println(longestSubstring("rfrxkmdb",8));
	}
}
