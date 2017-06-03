package offer;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * @author zhouliang
 *
 */

class test41 {
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null || array.length==0){
        	return;
        }
        int exclusive = 0;
        for(int i=0; i<array.length; i++){
        	exclusive ^= array[i];
        }
        int index = findFirst1(exclusive);
        num1[0] = num2[0] = 0;
        for(int i=0; i<array.length; i++){
        	int temp = array[i];
        	temp = temp >> index;
        	if((temp & 1)==0){
        		num1[0] ^= array[i];
        	}else{
        		num2[0] ^= array[i];
        	}
        }
    }
    
    public int findFirst1(int num){
    	int index = 0;
    	while( (num&1) == 0){
    		num = num >> 1;
        	index++;
    	}
    	return index;
    }
}
