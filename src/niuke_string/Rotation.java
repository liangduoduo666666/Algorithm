package niuke_string;

class Rotation {
    public boolean chkRotation(String A, int lena, String B, int lenb) {
        // write code here
    	if(lena != lenb){
    		return false;
    	}
    	String str = A+B;
    	return str.contains(B);
    }
}
