package SelectionSort;

public class SelectionSort {
    // nums[0,i]是排序的，nums(i,n]是无序的
    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
        return nums;
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // nums[0,i]是无序的，nums(i,n]是排序的
    public static int[] selectionSort2(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i; j >= 0; j--) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(nums, i, maxIndex);
        }
        return nums;
    }
}
