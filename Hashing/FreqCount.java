import java.util.*;

class FreqCount{
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,9};
        HashMap<Integer,Integer> Freq = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(Freq.containsKey(num)){
                Freq.put(num,Freq.get(num) + 1);
            }else{
                Freq.put(num,1);
            }
        }
        System.out.println(Freq);
    }
}