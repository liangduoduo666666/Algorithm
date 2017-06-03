package offer;

import java.util.Arrays;

/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣�
 * ��������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,
 * ������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 * �����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 * LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�
 * Ϊ�˷������,�������Ϊ��С����0��
 * @author zhouliang
 *
 */
class test46 {
    public static boolean isContinuous(int [] numbers) {
    	if(numbers==null || numbers.length==0){
    		return false;
    	}
    	Arrays.sort(numbers);
    	int countZero = 0;
    	int diff = 0;
    	for(int i=0; i<numbers.length-1; i++){
    		if(numbers[i]==0){
    			countZero++;
    			continue;
    		}
    		if(numbers[i]==numbers[i+1]){
    			return false;
    		}else{
    			diff += numbers[i+1] - numbers[i] - 1;
    		}
    	}
    	if(numbers[numbers.length-1] == 0){
    		countZero++;
    	}
    	if(countZero >= diff ){
    		return true;
    	}else{
    		return false;
    	}
    }
    public static void main(String[] args) {
		int[] array = {1,3,0,0,5};
		System.out.println(isContinuous(array));
	}
}
