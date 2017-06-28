package niuke_stack_queue;

/**
实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。
给定一个整数数组A即为给定的栈，同时给定它的大小n，请返回逆序后的栈。
测试样例：
[4,3,2,1],4
返回：[1,2,3,4]
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
   public int get(int[] A,int n){//获取数组n个元素中的最后一个元素
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
