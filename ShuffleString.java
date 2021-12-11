package nabiel.strings;

// resource : https://leetcode.com/problems/shuffle-string/
public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(solve("aiohn", new int[] { 3, 1, 4, 2, 0 }));
    }

    public static String solve(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return String.valueOf(res);
    }
}
