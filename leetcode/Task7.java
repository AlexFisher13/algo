package leetcode;

/**
 * 26. Удалить дубликаты из отсортированного массива (Medium)
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class Task7 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3};
        System.out.println(removeDuplicates(a));

        for (int e : a) {
            System.out.print(e);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count < 2 && nums[i] == nums[i - 1]) {
                nums[j] = nums[i];
                count++;
                j++;
            } else if (nums[i] != nums[i - 1]) {
                count = 1;
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
