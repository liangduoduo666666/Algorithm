package offer;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������
 * �ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * @author zhouliang
 *
 */
class test43 {
	//���������˿�ʼ��ͱȽϣ���һ����ΪS�ľ��ǳ˻���С��
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if(array==null || array.length==0){
    		return result;
    	}
    	int small = 0;
    	int big = array.length-1;
    	int currentSum = array[small] + array[big];
    	while(small<big){
    		if(currentSum == sum){
    			result.add(array[small]);
    			result.add(array[big]);
    			return result;
    		}    		
    		while(currentSum > sum && small<big){
    			big--;
    			currentSum = array[small] + array[big];
    		}
    		small++;
    		currentSum = array[small] + array[big];
    	}
        return result;
    }
}
