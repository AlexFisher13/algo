package leetcode;

/**
 * Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        long result = 0;
        int last = 0;

        while (x != 0) {
            last = x % 10;
            result += last;
            result *= 10;
            x /= 10;
        }
        result /= 10;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }

        return (int) result;
    }
}
