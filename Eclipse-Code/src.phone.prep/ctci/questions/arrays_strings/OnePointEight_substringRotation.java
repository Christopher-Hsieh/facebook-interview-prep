package ctci.questions.arrays_strings;

public class OnePointEight_substringRotation {
	public static void main(String[] args) {
		String str;
		
//		System.out.println("Bad: " + compressStringBad("aabcccccaaa"));
//		System.out.println("Good: " + compressStringGood("aabcccccaaa"));
		System.out.println(isRotation("waterbottle", "ewaterbottl"));
		System.out.println(isRotation("waterbottle", "aterbottlew"));
		System.out.println(isRotation("waterasdtle", "aterbottlew"));
		System.out.println(isRotation("asdf", "fdsaa"));
		System.out.println(isRotation("asdf", "dfas"));
	}
	
	public static boolean isRotation(String s1, String s2) {
		String str = s1 + s1;
		if (str.contains(s2)) return true;
		return false;
	}
}
