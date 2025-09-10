import java.util.Arrays;
class selectionSort{
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int n = arr.length;
        selectionSort(arr,n);
        System.out.print(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr,int n){
        if(n <= 1) return;
        selectionSort(arr,n-1);
        int temp = arr[n-1];
        int j=n-2;
        for(;j>=0&&arr[j] > temp;j--){
            arr[j+1] = arr[j];
        }
        arr[j+1] = temp;
    }

}