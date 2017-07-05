package niuke_stack_queue;

import java.util.ArrayList;

/**
���дһ�����򣬰������ջ�������򣨼����Ԫ��λ��ջ������
Ҫ�����ֻ��ʹ��һ�������ջ�����ʱ���ݣ������ý�Ԫ�ظ��Ƶ�������ݽṹ�С�
����һ��int[] numbers(C++��Ϊvector&ltint>)�����е�һ��Ԫ��Ϊջ����
�뷵��������ջ����ע������һ��ջ����ζ�������������ֻ�ܷ��ʵ���һ��Ԫ�ء�
����������
[1,2,3,4,5]
���أ�[5,4,3,2,1]
 * @author zhouliang
 *
 */
class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        int i = numbers.length - 1;
        int j = -1;
        while (i >= 0) {
            num = numbers[i--];
            while (j >= 0 && num > list.get(j)) {
                numbers[++i] = list.get(j--);
            }
            j++;
            if (list.size() < j + 1) {
                list.add(num);
            } else {
            	list.set(j, num);
            }
        }
        return list;
    }
}
