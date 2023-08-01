package algorithm;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3_LongestSubstringWithOutDuplicates {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //这里必须要取最大值，因为例如abba时，left如果不取历史最大值，那left回返回到较小的可能，这样子是肯定错的
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);

        }

        return maxLength;
    }

}
