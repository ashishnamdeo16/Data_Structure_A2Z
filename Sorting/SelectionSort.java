import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 10, 12, 33, 21, 1};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    //Function for Sorting
    public static void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }

            // Swaping elements
            int temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
