package niuke_sort;

/**
对于一个数组，请设计一个高效算法计算需要排序的最短子数组的长度。
给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的长度。
(原序列位置从0开始标号,若原序列有序，返回0)。保证A中元素均为正整数。
测试样例：
[1,4,6,5,9,10],6
返回：2
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
