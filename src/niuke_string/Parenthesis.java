package niuke_string;

/**
����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���
����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���
����������
"(()())",6
���أ�true
����������
"()a()()",7
���أ�true
����������
"()(()()",7
���أ�false
 * @author zhouliang
 *
 */
class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
    	int num = 0;
    	for(int i=0; i<n; i++){
    		if(num<0){
    			return false;
    		}
    		if(A.charAt(i)=='('){
    			num++;
    		}else if(A.charAt(i)==')'){
    			num--;
    		}
    	}
    	if(num==0){
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		System.out.println(chkParenthesis("()a()()",7));
	}
}
