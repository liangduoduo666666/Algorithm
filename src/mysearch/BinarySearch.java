package mysearch;

/**
 * 数组必须是有序的
 * 二分查找(递归实现)
 * @author zhouliang
 *
 */
public class BinarySearch {
	
	/**
	 * 递归的二分查找
	 * @param key
	 * @param array
	 * @return
	 */
	public static int recursiveRank(int key ,int[] array){
		return recursiveRank(key,0,array.length-1,array);
	}
	public static int recursiveRank(int key , int left ,int right, int[] array){
		if(left>right){
			return -1;
		}
		int mid = (right-left)/2+left;
		if(key>array[mid]){
			return recursiveRank(key,mid+1,right,array);
		}else if(key<array[mid]){
			return recursiveRank(key,left,mid-1,array);
		}else{
			return array[mid];
		}
	}
	
	/**
	 * 非递归的二分查找
	 * @param key
	 * @param array
	 * @return
	 */
	public static int rank(int key ,int[] array){
		int left = 0 , right = array.length-1;
		while(left<=right){
			int mid = (right-left)/2+left;
			if(key > array[mid]){
				left = mid + 1;
			}else if(key < array[mid]){
				right = mid - 1;
			}else{
				return array[mid];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a  = {1,2,3,4,5,6,7,8};
		int result = rank(10,a);
		System.out.println(result);
	}
}
