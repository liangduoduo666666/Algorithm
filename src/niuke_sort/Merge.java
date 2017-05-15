package niuke_sort;

/**
 * 
有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。请编写一个方法，将B合并入A并排序。
给定两个有序int数组A和B，A中的缓冲空用0填充，同时给定A和B的真实大小int n和int m，请返回合并后的数组。
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
