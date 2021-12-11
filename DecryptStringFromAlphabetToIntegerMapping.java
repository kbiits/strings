package nabiel.strings;

// resource : https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int delta1 = 'a' - '1';
        for (int i = 0; i < s.length(); i++) {
            if ((i + 2) >= s.length() || s.charAt(i + 2) != '#') {
                sb.append((char) (s.charAt(i) + delta1));
            } else {
                int intValue = Integer.parseInt(s.substring(i, i + 2));
                sb.append((char) ('a' - 1 + intValue));
                i += 2;
            }
        }
        return sb.toString();
    }
}
