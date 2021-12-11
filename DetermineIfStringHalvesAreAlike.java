package nabiel.strings;

import java.util.HashMap;
import java.util.Map;

// resource : https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }

    public static Map<Character, Integer> map = new HashMap<>() {
        {
            put('a', 1);
            put('i', 1);
            put('u', 1);
            put('e', 1);
            put('o', 1);
        }
    };

    public static boolean halvesAreAlike(String s) {
        int delta = 'a' - 'A';
        int count1 = 0;
        int count2 = 0;
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(n - 1 - i);
            if (left < 'a') {
                left += delta;
            }
            if (right < 'a') {
                right += delta;
            }
            if (map.containsKey(left)) {
                count1++;
            }
            if (map.containsKey(right)) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
