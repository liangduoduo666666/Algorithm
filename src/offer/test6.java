package offer;

class test6 {
	public int minNumberInRotateArray(int[] array) {
		for(int i=0; i<array.length-1; i++){
			if(array[i]>array[i+1]){
				return array[i+1];
			}
		}
		return array[array.length-1];
	}
	
	public static void main(String[] args) {
		int[] test = {3,4,5,2,2,};
		test6 t = new test6();
		int i = t.minNumberInRotateArray(test);
		System.out.println(i);
	}
}
