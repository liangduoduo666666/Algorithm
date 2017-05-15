package offer;

class test4 {
	// 4
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    	return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
    	
    	if(startPre>endPre||startIn>endIn)
    		return null;
    	TreeNode root=new TreeNode(pre[startPre]);
    	
    	for(int i=startIn;i<=endIn;i++)
    		if(in[i]==pre[startPre]){
    			root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
    			root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
    		}
    			
    	return root;
    }
    
/*    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0||in.length == 0){
             return null;
         }
         TreeNode node = new TreeNode(pre[0]);
         for(int i = 0; i < in.length; i++){
             if(pre[0] == in[i]){
                 node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                 node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
             }
         }
         return node;
     }*/
}

//4

