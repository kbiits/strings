package nabiel.strings;

// resource : https://leetcode.com/problems/sorting-the-sentence/
public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("sentence4 a3 is2 This1"));
    }

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for (String str : arr) {
            char pos = str.charAt(str.length() - 1);
            res[pos - '0' - 1] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", res);
    }
}
