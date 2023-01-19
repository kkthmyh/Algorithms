package LinearSearch;

public class LinearSearch<T> {
    public static <T> int search(T[] nums, T target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
