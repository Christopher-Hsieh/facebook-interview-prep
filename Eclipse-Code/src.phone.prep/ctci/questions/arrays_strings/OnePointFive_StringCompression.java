package ctci.questions.arrays_strings;

public class OnePointFive_StringCompression {
	/*
	 * Given a string aabcccccaaa we would compress it to a2b1c5a3
	 */
	public static void main(String[] args) {
		System.out.println("Bad: " + compressStringBad("aabcccccaaa"));
		System.out.println("Good: " + compressStringGood("aabcccccaaa"));
	}
	
	public static String compressStringBad(String string) {
		String compressedString = "";
		
		char[] charArray = string.toCharArray();
		char c = charArray[0];
		int currCount = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if (c == charArray[i] && i+1 != charArray.length) {
				currCount++;
			}
			else {
				if (i + 1 == charArray.length) currCount++;
				compressedString += Character.toString(c);
				compressedString += Integer.toString(currCount);
				c = charArray[i];
				currCount = 1;
			}
		}
		
		return compressedString;
	}
	
	public static String compressStringGood(String string) {
		StringBuffer strBuffer = new StringBuffer();
		
		char currChar = string.charAt(0);
		int currCount = 0;
		for (int i = 0; i < string.length(); i++) {
			if (currChar == string.charAt(i)) {
				currCount++;
			}
			else {
				strBuffer.append(currChar);
				strBuffer.append(currCount);
				currChar = string.charAt(i);
				currCount = 1;
			}
		}
		
		strBuffer.append(currChar);
		strBuffer.append(currCount);
		return strBuffer.toString();
	}
}
 