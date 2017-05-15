package offer;


class test1 {

	// 1
	public boolean Find(int target, int[][] array) {
		int i = 0;
		int j = array[0].length - 1;
		while (i < array.length && j >= 0) {
			if (array[i][j] == target) {
				return true;
			} else if (array[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}


}




