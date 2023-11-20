package leetcode;

/**
 * Сделайте строку лучше
 * https://leetcode.com/problems/make-the-string-great/
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }

    private static String makeGood(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!result.isEmpty() && isBadPair(ch, result.charAt(result.length() - 1))) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static boolean isBadPair(char a, char b) {
        return a != b && Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}
