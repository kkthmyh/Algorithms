# algorithm

##  线性查找
-  ### 代码
```java
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
```


##  选择排序
- ### 代码
```java
public class SelectionSort {
    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 假设arr[i,...]的左边界为最小值
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums,i,minIndex);
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```
- ### 扩展带范型的选择排序
```java
public class SelectionSortWithType {

    public static <T extends Comparable<T>> T[] selectionSort(T[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int minIndex = i;
            for (int j = i; j < elements.length; j++) {
                if (elements[j].compareTo(elements[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(elements, i, minIndex);
        }
        return elements;
    }


    private static <T> void swap(T[] elements, int i, int j) {
        T temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}
```
##  插入排序
- ### 代码
```java
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
```

##  