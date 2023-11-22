package leetcode;

/**
 * 26. Удалить дубликаты из отсортированного массива
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */
public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(a));

        for (int e : a) {
            System.out.print(e);
        }
    }

    // первый указатель - текущая позиция
    // второй указатель - следующая позиция
    // если элементы не равны - передвигаем оба указателя
    // если равны - двигаем только второй, до тех пор пока не будут равны
    // когда не равны - записываем элемент в позицию +1 от перовго указателя
    // выходим из цикла когда второй указатель дойдет до конца

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
