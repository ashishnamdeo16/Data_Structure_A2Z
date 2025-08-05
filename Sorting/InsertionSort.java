import java.util.*;

class InsertionSort{

    public static void main(String[] args) {
        int[] arr = {5,23,4,6,7,9};
        int[] newArr = insertionSort(arr);
        System.out.print(Arrays.toString(newArr));
    }


    public static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;

            // Shifting elements to right
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

}