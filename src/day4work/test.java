package day4work;

public class test {

	public static void main(String[] args) {
		String one = removeInvalidChars("g1ueaa");
		System.out.println(one);
	}
	
	public static boolean isInvalid(char c){
		boolean isInvalid = false;
		char[] invalidList = {'1','2','3','4','5','6','7', '8','9','0','.',',','!','"', ';',':'};
		for (int i=0; i<invalidList.length; i++){
			if(c == invalidList[i]){
				isInvalid = true;
			}
		}
		return isInvalid;
	}
	
	//method to remove an invalid character from string
	public static String removeInvalidChars(String wordToCheck){
		String afterCheck = wordToCheck;
		StringBuilder sb = new StringBuilder(wordToCheck);
		int i = 0;
		int counter = afterCheck.length();
		while(i<afterCheck.length()){
			if (isInvalid(sb.charAt(i))){
				sb.deleteCharAt(i);
				counter--;
			}
		i++;
		}
		afterCheck = sb.toString();
		return afterCheck;
	}

}
