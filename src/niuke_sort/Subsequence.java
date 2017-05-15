package niuke_sort;

/**
����һ�����飬�����һ����Ч�㷨������Ҫ��������������ĳ��ȡ�
����һ��int����A������Ĵ�Сn���뷵��һ����Ԫ�飬�����������еĳ��ȡ�
(ԭ����λ�ô�0��ʼ���,��ԭ�������򣬷���0)����֤A��Ԫ�ؾ�Ϊ��������
����������
[1,4,6,5,9,10],6
���أ�2
 * @author zhouliang
 *
 */
class Subsequence {
    public int shortestSubsequence(int[] A, int n) {
        // write code here
        int min=A[A.length-1],max=A[0];
        int l=0,r=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=max){
                max=A[i];
            }else{
                l=i;
            }
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i]<=min){
                min=A[i];
            }else{
                r=i;
            }
        }
        if(l==r)return 0;
        else return (l-r+1);
    }
    
    public static void main(String[] args) {
    	Subsequence s = new Subsequence();
    	int[] A = {1,4,6,5,9,10};
    	System.out.println(s.shortestSubsequence(A, A.length));
	}
}
