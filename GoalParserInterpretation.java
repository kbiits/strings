package nabiel.strings;

// resource : https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);
            if (ch != '(') {
                sb.append(ch);
            } else if (command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
            } else {
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }
}
