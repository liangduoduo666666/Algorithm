package niuke_sort;

/**
 * 
��������С���������Ժ������A��B������A��ĩ�����㹻�Ļ��������B�����дһ����������B�ϲ���A������
������������int����A��B��A�еĻ������0��䣬ͬʱ����A��B����ʵ��Сint n��int m���뷵�غϲ�������顣
 * @author zhouliang
 *
 */
class Merge {
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
        int index=n+m-1;
        int i=n-1;
        int j=m-1;
        while(i>=0&&j>=0){
            if(A[i]>B[j]){
                A[index]=A[i];
                i--;
            }else{
                A[index]=B[j];
                j--;
            }
            index--;
        }
        while(j>=0){
            A[index]=B[j];
            j--;
            index--;
        }
        return A;
    }
    public static void main(String[] args) {
		int[] A= {7,8,9,0,0,0};
		int[] B={1,2,3};
		int[] reuslt = new Merge().mergeAB(A,B,3,3);
		for(int i=0; i<6; i++){
			System.out.print(reuslt[i]+" ");
		}
	}
}
