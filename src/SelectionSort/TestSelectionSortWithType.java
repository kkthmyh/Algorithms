package SelectionSort;

public class TestSelectionSortWithType {


    public static void main(String[] args) {

        Integer[] nums = {3, 3, 1, 4, 0, 9};
        Integer[] newNums = SelectionSortWithType.selectionSort(nums);
        for (int num : newNums) {
            System.out.println(num);
        }
    }
}
