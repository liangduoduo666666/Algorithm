package mytree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。
保证结点数小于等于500。
 * @author zhouliang
 *
 */

class Tree {
    private TreeNode root;  
    
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    
    /**
     * 分层打印
     * @param root
     * @return
     */
    public int[][] printTree(TreeNode root) {
    	if(root == null){
    		return null;
    	}
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	TreeNode last = root;
    	TreeNode nlast = null ;
    	TreeNode currentNode = null;
    	ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	queue.add(last);
    	while(!queue.isEmpty()){
    		currentNode = queue.poll();
    		list.add(currentNode.val);
    		
    		if(currentNode.left!=null){
    			queue.add(currentNode.left);
    			nlast = currentNode.left;
    		}
    		if(currentNode.right!=null){
    			queue.add(currentNode.right);
    			nlast = currentNode.right;
    		}
    		if(currentNode == last){
    			lists.add(list);
    			last = nlast;
    			list = new ArrayList<Integer>();
    		}
    	}
    	int[][] result = new int[lists.size()][];
    	for(int i = 0 ; i < lists.size() ; i++){
    		result[i] = new int[lists.get(i).size()];
    		for(int j = 0 ; j < lists.get(i).size() ; j++){
    			result[i][j] = lists.get(i).get(j);
    		}
    	}
    	return result;
    }
   
    
    /** 
     * 递归创建二叉树 
     * @param node 
     * @param data 
     */  
    public void buildTree(TreeNode node,int data){  
        if(root == null){  
            root = new TreeNode(data);  
        }else{  
            if(data < node.val){  
                if(node.left == null){  
                    node.left = new TreeNode(data);  
                }else{  
                    buildTree(node.left,data);  
                }  
            }else{  
                if(node.right == null){  
                    node.right = new TreeNode(data);  
                }else{  
                    buildTree(node.right,data);  
                }  
            }  
        }  
    }  
    
    /** 
     * 前序遍历 
     * @param node 
     */  
    public void preOrder(TreeNode node){  
        if(node != null){  
            System.out.println(node.val);  
            preOrder(node.left);  
            preOrder(node.right);  
        }  
    }  
      
    /** 
     * 中序遍历 
     * @param node 
     */  
    public void inOrder(TreeNode node){  
        if(node != null){  
            inOrder(node.left);  
            System.out.println(node.val);  
            inOrder(node.right);  
        }  
    }  
      
    /** 
     * 后序遍历 
     * @param node 
     */  
    public void postOrder(TreeNode node){  
        if(node != null){  
            postOrder(node.left);  
            postOrder(node.right);  
            System.out.println(node.val);  
        }  
    }
    
    public static void main(String[] args) {
        int[] a = {2,4,12,45,21,6,111};  
        Tree bTree = new Tree();  
        for (int i = 0; i < a.length; i++) {  
            bTree.buildTree(bTree.root, a[i]);  
        }
               bTree.preOrder(bTree.root);  
               /*  bTree.inOrder(bTree.root);  
        bTree.postOrder(bTree.root); */
        System.out.println();
    	int[][] result = bTree.printTree(bTree.root);
    	for(int i = 0 ; i< result.length ; i++){
    		for(int j = 0 ; j < result[i].length ; j++){
    			System.out.print(result[i][j]+" ");
    		}
    		System.out.println();
    	}
    	

    	
    }
}