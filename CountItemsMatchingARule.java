package nabiel.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// resource : https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItemsMatchingARule {
    public static void main(String[] args) {
        String[][] arr = {
                { "phone", "blue", "pixel" },
                { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" }
        };
        List<List<String>> items = new ArrayList<>();
        for (String[] nestedItem : arr) {
            items.add(Arrays.asList(nestedItem));
        }
        System.out.println(countMatches(items, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int colIdx;
        switch (ruleKey) {
            case "type":
                colIdx = 0;
                break;
            case "color":
                colIdx = 1;
                break;
            default:
                colIdx = 2;
                break;
        }

        int count = 0;
        for (List<String> list : items) {
            if (list.get(colIdx).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
