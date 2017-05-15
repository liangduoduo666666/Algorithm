package niuke_string;



class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
class IdenticalTree {
    public static boolean chkIdentical(TreeNode A, TreeNode B) {
        // write code here
    	if(A == null || B == null){
    		return false;
    	}else{
    		String strA = getString(A);
    		String strB = getString(B);   	
    		System.out.println(strA);
    		System.out.println(strB);
    		if(strA.contains(strB)){
    			return true;
    		}else{
    			return false;
    		}
    	}
    }
    
    public static String getString(TreeNode root){
    	String temp = "";
    	if(root != null){
    		temp += root.val + "!";
    	}else{
    		return "#!";
    	}
    	temp += getString(root.left); 	
    	temp += getString(root.right);

    	return temp;
    }
    
    public static void main(String[] args) {
    	TreeNode A = new TreeNode(1);
    	TreeNode B = new TreeNode(2);
    	TreeNode C = new TreeNode(3);
    	TreeNode D = new TreeNode(4);
    	TreeNode E = new TreeNode(5);
    	
    	A.left = B;
    	A.right = C;
    	B.left = D;
    	B.right = E;
    	
    	TreeNode A1 = new TreeNode(1);
    	TreeNode B1 = new TreeNode(2);
    	TreeNode C1 = new TreeNode(3);
    	TreeNode D1 = new TreeNode(4);
    	TreeNode E1 = new TreeNode(5);
    	
    	A1.left = B1;
    	A1.right = C1;
    	B1.left = D1;

    	System.out.println(chkIdentical(A,A1));

	}
}