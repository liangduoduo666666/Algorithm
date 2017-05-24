package offer;

import java.util.Arrays;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ
 * @author zhouliang
 *
 */
class test24 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence==null || sequence.length==0){
    		return false;
    	}
    	int root = sequence[sequence.length-1];
    	int i,j;
    	for(i=0; i<sequence.length-1; i++){
    		if(sequence[i]>root){
    			break;
    		}
    	}
    	j = i;
    	for(;j<sequence.length-1; j++){
    		if(sequence[j]<root){
    			return false;
    		}
    	}
    	boolean left = true;
    	if(i>0){
    		left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
    	}
    	boolean right = true;
    	if(j<sequence.length-1){
    		right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, j, sequence.length-1));
    	}
        return left&&right;
    }
    
    public static void main(String[] args) {
		System.out.println(VerifySquenceOfBST(new int[]{1,6,3,7,9,8,5}));
	}
}
