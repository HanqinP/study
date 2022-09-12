package algorithm;

import java.util.HashMap;

public class LeetCode13_RomanToInteger {

	public int romanToInt(String s) {

		int result = 0;
		char currentChar;
		char nextChar;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < s.length(); i++) {
			currentChar = s.charAt(i);

			if (map.containsKey(currentChar)) {
				if (i != s.length() - 1) {
					nextChar = s.charAt(i + 1);
					if (currentChar == 'I' && nextChar == 'V' || currentChar == 'I' && nextChar == 'X'
							|| currentChar == 'X' && nextChar == 'L' || currentChar == 'X' && nextChar == 'C'
							|| currentChar == 'C' && nextChar == 'D' || currentChar == 'C' && nextChar == 'M') {
						result += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
						i++;
						continue;
					}

				}

				result += map.get(s.charAt(i));

			}

		}

		return result;
	}

}
