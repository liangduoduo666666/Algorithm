package offer;

/**
 * һ�����������������������֮�⣬���������ֶ����������Ρ�
 * ��д�����ҳ�������ֻ����һ�ε����֡�
 * @author zhouliang
 *
 */

class test41 {
	//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
	//��num1[0],num2[0]����Ϊ���ؽ��
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
