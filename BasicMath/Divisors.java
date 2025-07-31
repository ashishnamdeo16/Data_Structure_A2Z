import java.util.Arrays;
class Divisors{
    public static void main(String[] args) {
        int num=20;
        System.out.print("Divisors of " + num + ": ");
        int j=0;
        boolean first = true;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}