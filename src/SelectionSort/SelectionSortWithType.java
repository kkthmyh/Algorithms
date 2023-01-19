package SelectionSort;

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
