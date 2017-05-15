package offer;

class test13 {
    public static void reOrderArray(int [] array) {
    	int i,j,index;
        for(i=0; i<array.length; i++){
        	index = i+1;
        	int temp = array[i];
        	//遇到偶数，找下一个奇数
        	if(temp%2==0){
            	for(j=index; j<array.length; j++){       
            		if(array[j]%2!=0){
            			index = j;       		
            			int jishu = array[j];
            			while(j>i){
            				array[j] = array[j-1];
            				j--;
            			}            			
            			array[j] = jishu;
            			j = index;
            			break;
            		}
            	}
        	}
        }
    }
    
    public static void main(String[] args) {
    	int[] test = {3,7,6,8,9,4,2,5};
    	reOrderArray(test);
    	for(int i=0; i<test.length; i++){
    		System.out.println(test[i]);
    	}
	}
}
