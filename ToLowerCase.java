package nabiel.strings;

// resource : https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Abcsd"));
        System.out.println(toLowerCase("AAAA123123asdas"));
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int delta = 'a' - 'A';
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + delta));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
