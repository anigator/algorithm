package unique;

import java.util.HashMap;

public class UniqueString {

	public static boolean isUniqueChar(String str) {
		HashMap<String, Boolean> map = new HashMap<>();
		int strLength = str.length();
		for (int i=0; i < strLength; i++) {
			String charString = String.valueOf(str.charAt(i));
			if (map.containsKey(charString)) {
				return false;
			}
			map.put(String.valueOf(str.charAt(i)), true);
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str ="abcdefghijkl";
		System.out.println(isUniqueChar(str));
	}
}
