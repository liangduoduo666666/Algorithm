package offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author zhouliang
 *
 */
class test49 {
    public int Add(int num1,int num2) {
    	int sum,carry;
    	while(num2!=0){ //重复一直到没有进位
    		sum = num1 ^ num2; //异或，相当于每一位做加法，并且不进位
    		carry = (num1 & num2) << 1;//carry代表进位的值，只有1+1才有进位，做位与运算时只有1&1 = 1，其他位都是0，再左移
    		num1 = sum;
    		num2 = carry;
    	}
        return num1;
    }
}
