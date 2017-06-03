package offer;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数。
 * @author zhouliang
 *
 */
class test32 {
    public static int NumberOf1Between1AndN_Solution(int n) {
    	if(n<=0){
    		return 0;
    	}else{
            return NumberOf1(n+"");
    	}
    }
    
    public static int NumberOf1(String  strN){
    	if(strN=="" || strN==null){
    		return 0;
    	}
    	int first = strN.charAt(0)-'0';
    	int length = strN.length();
    	if(first>0 && length==1){
    		return 1;
    	}
    	if(first==0 && length==1){
    		return 0;
    	}
    	String recursiveStr = Integer.parseInt(strN.substring(1, strN.length()))+"";
    	System.out.println(recursiveStr);
    	int numFirst = 0 ,numOther = 0,numRecursive = 0;
    	if(first>1){
    		numFirst = powerBase10(length-1);
    	}else{
    		numFirst = Integer.parseInt(strN.substring(1,strN.length()))+1;
    	}
    	numOther = first * (length-1) * powerBase10(length-2);
    	numRecursive = NumberOf1(recursiveStr);
    	return numFirst + numOther + numRecursive;
    }
    
    public static int powerBase10(int length){
    	int result = 1;
		for(int i=0; i<length; i++){
			result *= 10;
		}
		return result;
    }
    
    public static void main(String[] args) {
    	int i = NumberOf1Between1AndN_Solution(10000);
    	System.out.println(i);
	}
}
