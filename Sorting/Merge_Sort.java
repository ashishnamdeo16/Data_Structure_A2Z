import java.util.Arrays;

class Merge_Sort{
public static void main(String[] args) {
    int[] unsortedArray = {3,1,2,4,5};
    int[] sortedArray = MergeSort(unsortedArray);
    System.out.print(Arrays.toString(sortedArray));
  }

    // Function to merge two sorted arrays into one sorted array
  public static int[] merge(int[] leftHalf,int[] rightHalf){
    int[] mergedArray = new int[leftHalf.length + rightHalf.length];
    int i=0;
    int j=0;
    int k=0;

    // Comparing elements of both arrays and insert the smaller one
    while(i<leftHalf.length && j<rightHalf.length){
        if(leftHalf[i] < rightHalf[j]){
            mergedArray[k] = leftHalf[i];
            k++;
            i++;
        }else{
            mergedArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    // Copy remaining elements from rightHalf
    while(j<rightHalf.length){
        mergedArray[k] = rightHalf[j];
        k++;
        j++;
    }

    // Copy remaining elements from leftHalf
    while(i<leftHalf.length){
        mergedArray[k] = leftHalf[i];
        k++;
        i++;
    }
    return mergedArray;
  }

    // Recursive function to perform Merge Sort
  public static int[] MergeSort(int[] arr){
    // Base case: if the array has only one element, it's already sorted
    if(arr.length == 1) return arr;
    int mid = arr.length/2;

    // Divide the array into left and right halves
    int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
    int[] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));


    // Merge the sorted halves
    int[] updatedArr = merge(left,right);
    return updatedArr;
  }
}
