package SelectionSort;

public class TestSelectionSort {


    public static void main(String[] args) {

        int[] nums = {3,3,1,4,0,9};
        int[] newNums = SelectionSort.selectionSort(nums);
        for (int num : newNums) {
            System.out.println(num);
        }


    }
}
