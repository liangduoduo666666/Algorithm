package offer;

/**
 * ��ʵ�������������ֱ��������л��ͷ����л�������
 * 
 * @author zhouliang
 *
 */
class test62 {
	int index = -1;
	String Serialize(TreeNode root) {
		if(root == null){
			return "#,";
		}
		String result = root.val+",";
		result += Serialize(root.left);
		result += Serialize(root.right);
		return result;
	}

	TreeNode Deserialize(String str) {
		TreeNode node = null;
		if(str == null || str.length() <= 0){
			return node;
		}
		index++;
		String[] strs = str.split(",");
		if(!strs[index].equals("#")){
			node = new TreeNode(Integer.valueOf(strs[index]));
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}
		return node;
	}
}
