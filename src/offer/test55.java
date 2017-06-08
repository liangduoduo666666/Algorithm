package offer;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，
 * 第一个只出现一次的字符是"l"。
 * 
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 * @author zhouliang
 *
 */
class test55 {
	/*
	 * 利用一个int型数组表示256个字符，这个数组初值置为-1. 
	 * 每次读出一个字符，将该字符的位置存入字符对应数组下标中。
	 * 若值为-1标识第一次读入，不为-1且》0表示不是第一次读入，
	 * 将值改为-2. 之后在数组中找到>0的最小值，该数组下标对应的字符为所求。
	 */
	private int[] occurence = new int[256]; //存的是字符第一次在字符流中出现的位置
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
			//当occurence[i] >= 0代表这个字符只出现过一次
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
