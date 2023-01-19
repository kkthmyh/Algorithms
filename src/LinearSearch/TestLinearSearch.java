package LinearSearch;

import java.util.Arrays;

public class TestLinearSearch<T>{

    public static void main(String[] args) {

        Integer[] nums = {1, 5, 9, 5, 5, 8};
        int search = LinearSearch.search(nums, 99);
        if (search != -1) {
            System.out.println("find element index is " + search);
        } else {
            System.out.println("can not find");
        }
    }




}
