package niuke_sort;

/**
 * 
������һ���к��ж��ź���ľ��������һ����Ч�㷨�����ٲ��Ҿ������Ƿ���ֵx��
����һ��int����mat��ͬʱ���������Сnxm�������ҵ���x���뷵��һ��boolֵ������������Ƿ����x��
���о��������ּ�x��Ϊint��Χ����������֤n��m��С�ڵ���1000��
����������
[[1,2,3],[4,5,6],[7,8,9]],3,3,10
���أ�false
 * @author zhouliang
 *
 */
class Finder {
    public boolean findX(int[][] mat, int n, int m, int x) {
    	int i = 0, j = m-1;
    	boolean result = false;
    	while(j>=0 && i<=n-1){
    		if(mat[i][j] > x){
    			j--;
    		}else if(mat[i][j] < x){
    			i++;
    		}else{
    			result = true;
    			break;
    		}
    	}
    	return result;
    }
    public static void main(String[] args) {
    	Finder f = new Finder();
    	int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    	System.out.println(f.findX(mat, 3, 3, 6));
	}
}
