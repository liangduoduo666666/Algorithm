package offer;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"l"��
 * 
 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
 * @author zhouliang
 *
 */
class test55 {
	/*
	 * ����һ��int�������ʾ256���ַ�����������ֵ��Ϊ-1. 
	 * ÿ�ζ���һ���ַ��������ַ���λ�ô����ַ���Ӧ�����±��С�
	 * ��ֵΪ-1��ʶ��һ�ζ��룬��Ϊ-1�ҡ�0��ʾ���ǵ�һ�ζ��룬
	 * ��ֵ��Ϊ-2. ֮�����������ҵ�>0����Сֵ���������±��Ӧ���ַ�Ϊ����
	 */
	private int[] occurence = new int[256]; //������ַ���һ�����ַ����г��ֵ�λ��
	private int index;

	public test55() {
		for (int i = 0; i < 256; i++) {
			occurence[i] = -1;
		}
		index = 0;
	}

	// Insert one char from stringstream
	public void Insert(char ch) {
		if (occurence[ch] == -1) {
			occurence[ch] = index;
		} else if (occurence[ch] >= 0) {
			occurence[ch] = -2;
		}
		index++;
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		char ch = '\0';
		int minIndex = Integer.MAX_VALUE;
		for (int i = 0; i < 256; i++) {
			//��occurence[i] >= 0��������ַ�ֻ���ֹ�һ��
			if (occurence[i] >= 0 && occurence[i] < minIndex) {
				ch = (char) i;
				minIndex = occurence[i];
			}
		}
		if (ch == '\0') {
			return '#';
		}
		return ch;
	}
}
