package offer;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 
 * @author zhouliang
 *
 */
class test50 {
	public static int StrToInt(String str) {
		if (str == null || str.equals("")) {
			return 0;
		}
		char[] chars = str.toCharArray();
		char first = chars[0];
		int result = 0;
		if (first == '+') {
			result = charsToInt(chars, 1);
		} else if (first == '-') {
			result = -charsToInt(chars, 1);
		} else {
			result = charsToInt(chars, 0);
		}
		return result;
	}

	public static int charsToInt(char[] chars, int begin) {
		int result = 0;
		for(int i=chars.length-1,digit = 0; i>=begin; i--,digit++){
			char temp = chars[i];
			if(temp>='0' && temp<='9'){
				int num = temp - '0';
				int index = 0;
				if(digit == 0){
					result += num;
				}else{
					int carry = 1;
					while(index < digit){
						carry = carry*10;
						index++;
					}
					result += num*carry;
				}		
				
			}else{
				return 0;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(StrToInt("532"));
	}
}
