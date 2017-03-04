package offer;

public class No4 {
	
	/**
	 * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“。
     *
     * @param string     要转换的字符数组
     * @return 转换后的字符串
	 */
	public static String replaceBlank(char[] string){
		//判断输入是否合法
		if(string == null){
			return null;
		}
		
		//统计字符数组中的空白字符数
		int whiteCount = 0;
		for(int i = 0; i < string.length; i++){
			if(string[i] == ' '){
				whiteCount++;
			}
		}
		//判断空格是否为0个
		if(whiteCount == 0){
			return null;
		}
		//计算转换后的字符长度是多少
		int targetLength = whiteCount * 2 + string.length;
		char[] temp = new char[targetLength];
		int j = targetLength - 1;//从新数组最末尾开始
		int i = string.length - 1;//从字符串最末尾开始
		
		while(i >= 0){
			if(string[i] == ' '){
				temp[j--] = '0';
				temp[j--] = '2';
				temp[j--] = '%';
			} else {
				temp[j--] = string[i];
				
			}
			i--;
		}
		
		return new String(temp);
	}

	public static void main(String[] args) {
		String str = "We are happy.";
		char[] array = str.toCharArray();
		System.out.println(replaceBlank(array));
		String str1 = "Wearehappy.";
		char[] array1 = str1.toCharArray();
		System.out.println(replaceBlank(array1));
		String str2 = " Wearehappy.";
		char[] array2 = str2.toCharArray();
		System.out.println(replaceBlank(array2));
		String str3 = " ";
		char[] array3 = str3.toCharArray();
		System.out.println(replaceBlank(array3));
		
	}
}
