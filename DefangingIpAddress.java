package strings;

// resource : https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingIpAddress {
    public static void main(String[] args) {
        System.out.println(solve("1.1.1.1"));
    }

    public static String solve(String ipAddr) {
        StringBuilder sb = new StringBuilder();
        for (char ch : ipAddr.toCharArray()) {
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
