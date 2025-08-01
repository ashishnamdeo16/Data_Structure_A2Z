import java.util.*;
class ReverseArray{
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int start = 0;
        revArry(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    public static void revArry(int[] arr,int start,int end){
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArry(arr,start+1,end-1);
        }
    }
}