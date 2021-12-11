package nabiel.strings;

// resource : https://www.geeksforgeeks.org/frequency-substring-string/
public class FrequencyOfASubstringInAString {
    public static void main(String[] args) {
        String str = "asduvbabalonbalonaasdasd";
        String substr = "balon";
        System.out.println(solve(substr, str));
    }

    public static int solve(String substr, String str) {
        return 0;
    }

    public static int naiveSolve(String substr, String str) {
        int subLength = substr.length();
        int strLength = str.length();

        int counter = 0;

        for (int i = 0; i <= strLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                counter++;
            }
        }

        return counter;
    }
}
