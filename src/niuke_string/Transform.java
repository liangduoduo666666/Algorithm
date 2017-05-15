package niuke_string;

class Transform {
    public static boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
    	if(lena != lenb){
    		return false;
    	}
    	char[] charA = A.toCharArray();
    	char[] charB = B.toCharArray();
    	int[] flagsA = new int[256];
    	for(int i=0; i<lena; i++){
    		flagsA[(int)charA[i]]++;
    	}
    	int[] flagsB = new int[256];
    	for(int i=0; i<lenb; i++){
    		flagsB[(int)charB[i]]++;
    	}
    	boolean result = true;
    	for(int i=0; i<256; i++){
    		if(flagsA[i]!=flagsB[i]){
    			result = false;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	System.out.println(chkTransform("abbc12",6,"12acbc",6));
	}
}
