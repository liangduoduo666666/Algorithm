package offer;

public class test18 {
    public static boolean HasSubtree(TreeNode A,TreeNode B) {
    	boolean result = false;
    	if(A!=null && B!=null){
    		if(A.val == B.val){
    			result = DoesTree1HaveTrees(A,B);
    		}
    		if(!result){
    			result = HasSubtree(A.left,B);
    		}
    		if(!result){
    			result = HasSubtree(A.right,B);
    		}
    	}
    	return result;
    }
    
    public static boolean DoesTree1HaveTrees(TreeNode A,TreeNode B){
    	if(B==null){
    		return true;
    	}
    	if(A==null){
    		return false;
    	}
    	if(A.val!=B.val){
    		return false;
    	}
    	return DoesTree1HaveTrees(A.left,B.left)&&DoesTree1HaveTrees(A.right,B.right);
    }

}
