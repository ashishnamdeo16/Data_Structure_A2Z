import java.util.Scanner;
class Ntimes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intial = 1;
        int num = sc.nextInt();
        toPrintNtimes(num,intial);
    }

    public static void toPrintNtimes(int num,int start){
        if(start == num+1){
            return;
        }
        System.out.println( "Ashish" + " " + start);
        toPrintNtimes(num,start+1);
    }
}