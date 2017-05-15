package niuke_sort;


/**
 * 
�����һ����Ч�㷨���ж��������Ƿ����ظ�ֵ�����뱣֤����ռ临�Ӷ�ΪO(1)��
����һ��int����A�����Ĵ�Сn���뷵�����Ƿ����ظ�ֵ��
����������
[1,2,3,4,5,5,6],7
���أ�true
 * @author zhouliang
 *
 */
class Checker {
    public boolean checkDuplicate(int[] a, int n) {
        // write code here
    	headSort(a,n);
    	boolean flag = false;
    	for(int i=1; i<n; i++){
    		if(a[i]==a[i-1]){
    			flag = true;
    		}
    	}
    	return flag;
    }
    
    public static void headSort(int[] a, int n){
    	int i,j,k;
    	for(i=n/2; i>=0; i--){
    		while((2*i+1) < n){
        		j = 2*i + 1;
    			if((j+1)<n){
    				if(a[j+1]>a[j]){
    					j++;
    				}
    			}
				if(a[j]>a[i]){
					swap(a,i,j);
					i = j;
				}else{
					break;
				}
    		}
    	}
    	
    	for(i=n-1; i>0; i--){
    		swap(a,0,i);
    		k = 0;
    		while(2*k+1<i){
    			j = 2*k+1;
    			if((j+1)<i){
    				if(a[j+1]>a[j]){
    					j++;
    				}
    			}
    			if(a[j]>a[k]){
    				swap(a,k,j);
    				k = j;
    			}else{
    				break;
    			}
    		}
    	}
    }
    
    public static void swap(int[] a, int i, int j){
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
    
}
