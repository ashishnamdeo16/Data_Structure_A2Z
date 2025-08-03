import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        int[] newArr = bubbleSort(arr);
        System.out.print(Arrays.toString(newArr));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int j = 0; j < arr.length - 1; j++) {
            swapped = false;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swaping
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            // Stop if no swaps in this pass
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
