package niuke_stack_queue;

/**
ʵ��һ��ջ�����򣬵���ֻ���õݹ麯�������ջ�����pop������ʵ�֣��������Լ�������������ݽṹ��
����һ����������A��Ϊ������ջ��ͬʱ�������Ĵ�Сn���뷵��������ջ��
����������
[4,3,2,1],4
���أ�[1,2,3,4]
 * @author zhouliang
 *
 */
class StackReverse {
    public int[] reverseStack(int[] A, int n) {
        // write code here
        if(n==0){
            return A;
        }
       int a=get(A,n);
       n--;
       reverseStack(A,n);
       A[n]=a;
       return A;
    }      
   public int get(int[] A,int n){//��ȡ����n��Ԫ���е����һ��Ԫ��
        int result=A[n-1];
        n--;
        if(n==0){
            return result;
        }
        else{
            int last=get(A,n);
            A[n-1]=result;
            return last;
        }
    }
}
