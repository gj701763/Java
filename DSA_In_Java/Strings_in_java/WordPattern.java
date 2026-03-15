package DSA_In_Java.Strings_in_java;

import java.util.*;

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
		Map<Character, String> map = new HashMap<>();
		Set<String> usedWords = new HashSet<>();

		if (pattern.length() != arr.length)
			return false;

		char[] p = pattern.toCharArray();
		for (int i = 0; i < p.length; i++) {
			char c = p[i];
			String word = arr[i];

			if (map.containsKey(c)) {
				if (!map.get(c).equals(word))
					return false;
			} else {
				if (usedWords.contains(word))
					return false;

				map.put(c, word);
				usedWords.add(word);
			}
		}
		return true;
	}
	public static void main(String a[]) {
		String pattern = "abba", s = "dog cat cat fish";
		System.out.println(wordPattern(pattern, s));
	}
}