package niuke_sort;

/**
 * ��������
 * @author zhouliang
 *
 */
class RadixSort {
    public int[] radixSort(int[] A, int n) {
        // write code here��������
        if(A ==null || n<2) 
            return null;
        int a=1;//������������ؼ��ֵĸ�������λ
        int m=1;//ָ���λ��
        int k=0;// �������Ľ��
        //��ά��ʾ0-9��Ͱ����ά��ʾÿ���ؼ��ָ���λ�ϵ�����,ÿ��Ͱ�ڿ�����n��ֵ
        int [][] number = new int [10][n];
        //����һ�������ʾnumber�����ÿһ��Ͱ�������Ŀ��
        int [] count = new int [10];
        while(m<=4){
            for(int j=0;j<A.length;j++){
                int lsd = ((A[j]/a)%10);//�õ�����
                number[lsd][count[lsd]] =A[j];
                count[lsd]++;//����Ϊlsd,���ĸ�Ͱ��Ҳȷ������˽�Ͱ�ڵ���Ŀ�Լ�
            }
            for(int p=0;p<10;p++){
                //��Ͱ�ڵ�ֵȡ�������·��뵽������
                if(count[p] !=0){//�ж����ĸ�Ͱ�ڵĲ����ڸ�Ͱ�ڵĹؼ��ֵĸ�����Ϊ0
                    for(int q=0;q< count[p];q++){
                        A[k] = number[p][q];
                        k++;
                    }
                }
                count[p]=0;
            }
            k=0;
            a*=10;
            m++;
        }
        return A;
    }
}
