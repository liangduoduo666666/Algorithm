package niuke_sort;

/**
 *
��һ��ֻ��0��1��2����Ԫ�ع��ɵ��������飬��ʹ�ý�����ԭ�����������ʹ�ü�����������
����һ��ֻ��0��1��2����������A�����Ĵ�С���뷵�����������顣��֤�����СС�ڵ���500��
����������
[0,1,1,0,2,2],6
���أ�[0,0,1,1,2,2]
 * @author zhouliang
 *
 */
class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
        int left = -1, right = n;
        int index = 0;
        while(index < n && index<right){
        	if(A[index] == 0){
        		if(A[left+1]!=0){
        			swap(A, left+1, index);
        		} 
        		left++;
        		index++;
        	}else if(A[index] == 2){
        		if(A[right-1]!=2){
        			swap(A, right-1, index);
        		}	
        		right--;
        	}else{
        		index++;
        	}
        }
        return A;
    }
    
    public void swap(int[] A, int i, int j){
    	int temp = A[i];
    	A[i] = A[j];
    	A[j] = temp;
    }
	public static void main(String[] args) {
		ThreeColor t = new ThreeColor();
		int[] A = {0,1,1,0,2,2};
		int[] result = t.sortThreeColor(A, A.length);
		for(int i : result){
			System.out.println(i);
		}
	}

}
