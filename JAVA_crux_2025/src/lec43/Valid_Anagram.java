package lec43;

import java.util.HashMap;

public class Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		System.out.println(Anagram(s, t));
	}

	public static boolean Anagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false; // extra char or mismatch
			}
			map.put(c, map.get(c) - 1);
		}

		for (int val : map.values()) {
			if (val != 0)
				return false;
		}

		return true;
	}

}
