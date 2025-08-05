import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        for(int i=0;i<nums.length;i++){
            int minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }

                // Swaping elements
                int temp = nums[j];
                nums[j] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        System.out.print(Arrays.toString(nums));


//        int[] arr = {5, 3, 4, 1, 2};
//        int[] newArr = bubbleSort(arr);
//        System.out.print(Arrays.toString(newArr));
//    }
//
//    public static int[] bubbleSort(int[] arr) {
//        boolean swapped;
//        for (int j = 0; j < arr.length - 1; j++) {
//            swapped = false;
//            for (int i = 0; i < arr.length - 1 - j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    // Swaping
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    swapped = true;
//                }
//            }
//            // Stop if no swaps in this pass
//            if (!swapped) {
//                break;
//            }
//        }
//        return arr;
    }
}
