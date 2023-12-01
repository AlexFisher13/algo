package leetcode;

/**
 * 169 . Элемент большинства
 * https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class Task8 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0 && majority != nums[i]) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
