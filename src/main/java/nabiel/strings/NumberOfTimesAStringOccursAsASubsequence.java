package nabiel.strings;

// ex : 
// subsequence : 12
// string : 1221
// result : 1
public class NumberOfTimesAStringOccursAsASubsequence {
    public static void main(String[] args) {
        System.out.println(count("1221", "12"));
    }

    public static int count(String str, String sub) {
        if (sub.isEmpty()) {
            return 1;
        }

        if (str.isEmpty()) {
            return 0;
        }

        int result = 0;
        if (sub.charAt(0) == str.charAt(0)) {
            result += count(str.substring(1), sub.substring(1));
        }
        count(str.substring(1), sub);

        return result;
    }
}
