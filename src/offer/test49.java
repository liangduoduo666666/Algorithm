package offer;

/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 * @author zhouliang
 *
 */
class test49 {
    public int Add(int num1,int num2) {
    	int sum,carry;
    	while(num2!=0){ //�ظ�һֱ��û�н�λ
    		sum = num1 ^ num2; //����൱��ÿһλ���ӷ������Ҳ���λ
    		carry = (num1 & num2) << 1;//carry�����λ��ֵ��ֻ��1+1���н�λ����λ������ʱֻ��1&1 = 1������λ����0��������
    		num1 = sum;
    		num2 = carry;
    	}
        return num1;
    }
}
