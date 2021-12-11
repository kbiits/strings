package nabiel.strings;

// resource : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] { "a", "bc" }, new String[] { "ab", "c" }));
        System.out.println(arrayStringsAreEqual(new String[] { "a", "bc" }, new String[] { "ab", "cd" }));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String word : word1) {
            s1.append(word);
        }
        for (String word : word2) {
            s2.append(word);
        }
        return s1.toString().equals(s2.toString());
    }
}
