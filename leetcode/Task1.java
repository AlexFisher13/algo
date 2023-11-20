package leetcode;

/**
 * Найдите индекс первого вхождения в строку
 * https://leetcode.com/problems/make-the-string-great/
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        int i = 0, j = 0;
        int sameCount = 0;
        while (i < haystackArr.length && j < needleArr.length) {
            if (haystackArr[i] == needleArr[j]) {
                i++;
                j++;
                sameCount++;
            } else {
                j = 0;
                if (sameCount > 0) i = i - sameCount + 1;
                else i++;
                sameCount = 0;
            }
        }
        return j == needleArr.length ? i - needleArr.length : -1;
    }
}
