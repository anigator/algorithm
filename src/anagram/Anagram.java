package anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	private HashMap<String, Integer> originStrMap = new HashMap<>();
	private HashMap<String, Integer> targetStrMap = new HashMap<>();
	
	public void makeStrCount(String inputStr, HashMap<String, Integer> countMap) {
		for (int i = 0; i < inputStr.length(); i++) {
			String keyChar = String.valueOf(inputStr.charAt(i));
			if (countMap.containsKey(keyChar)) {
				countMap.put(keyChar, countMap.get(keyChar) + 1);
			} else {
				countMap.put(keyChar,  1);
			}
		}
	}
	
	public boolean isAnagram() {
		if (originStrMap.size() != targetStrMap.size()) {
			return false;
		}
		
		for (Map.Entry<String, Integer> map : originStrMap.entrySet()) {
			if (map.getValue() != targetStrMap.get(map.getKey())) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		String origin  = "abcdefgbaa";
		String target  = "abcdegfaba";
		String target2 = "abcdegfabc";
		
		anagram.makeStrCount(origin, anagram.originStrMap);
		anagram.makeStrCount(target, anagram.targetStrMap);
		System.out.println(anagram.isAnagram());
		
		anagram.makeStrCount(target2, anagram.targetStrMap);
		System.out.println(anagram.isAnagram());
	}
}
