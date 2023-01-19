package InsertSort;

public class InsertSort {
    public static int[] insertSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (nums[j] <= nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
