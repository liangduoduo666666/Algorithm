package niuke_string;

import java.util.HashMap;

/**
����һ���ַ���,�����һ����Ч�㷨���ҵ��ַ���������ظ��ַ����Ӵ����ȡ�
����һ���ַ���A�����ĳ���n���뷵����������ظ��ַ��Ӵ����ȡ���֤A���ַ�ȫ��ΪСдӢ���ַ����ҳ���С�ڵ���500��
����������
"aabcb",5
���أ�3
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
