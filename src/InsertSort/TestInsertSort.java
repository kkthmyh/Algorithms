package InsertSort;

public class TestInsertSort {

    public static void main(String[] args) {
        int[] nums = {0, -1, 2, 2, 1, 5, 4};
        int[] arr = InsertSort.insertSort(nums);
        for (int num : arr) {
            System.out.println(num);
        }
    }

}
