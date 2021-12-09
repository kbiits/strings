package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// resource : https://leetcode.com/problems/last-substring-in-lexicographical-order/
public class LastSubstringInLexicographicalOrder {
    public static void main(String[] args) {
        String s = "abab";
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        s = String.valueOf(chs);
        List<String> result = solve("", s, new ArrayList<>());
        System.out.println(result.get(result.size() - 1));
    }

    public static List<String> solve(String p, String up, List<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        solve(p + up.charAt(0), up.substring(1), list);
        solve(p, up.substring(1), list);
        return list;
    }
}
