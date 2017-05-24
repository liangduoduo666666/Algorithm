package offer;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾���
 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 *   �����δ�ӡ������
 *  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author zhouliang
 *
 */
class test20 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	if(matrix.length<=0){
    		return null;
    	}
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int start = 0;
    	int columns = matrix[0].length;
    	int rows = matrix.length;
    	while(columns> start * 2 && rows > start * 2){
    		printCircle(matrix, result, columns, rows, start);
    		start++;
    	}
        return result;
    }
    
    public static void printCircle(int [][] matrix ,ArrayList<Integer> result, int columns, int rows, int start){
    	int endX = columns-1-start;
    	int endY = rows-1-start;
    	for(int i=start; i<=endX; i++){
    		result.add(matrix[start][i]);
    	}
    	
    	if(start < endY){
    		for(int i=start+1; i<=endY; i++){
    			result.add(matrix[i][endX]);
    		}
    	}
    	
    	if(start<endY && start<endX){
        	for(int i=endX-1; i>=start; i--){
        		result.add(matrix[endY][i]);
        	}
    	}

    	if(start<endX && start<endY-1){
    		for(int i=endY-1; i>=start+1; i--){
    			result.add(matrix[i][start]);
    		}
    	}
    
    }
    
    public static void main(String[] args) {
		int[][] a = {{1,2},{3,4},{5,6}};
		ArrayList<Integer> result = printMatrix(a);
		for(Integer i : result){
			System.out.println(i);
		}
	}
}
