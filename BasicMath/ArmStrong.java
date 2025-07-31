class ArmStrong{
    public static void main(String[] args) {
        int num = 371;
        int count =0;
        int dummy = num;
        while(num > 0){
            num /= 10;
            count++;
        }

        num = dummy;
        int newNum = 0;

        while(num > 0){
             int digit = num%10;
            int poweredDigit = 1;

            // Without Using the Pow Function
            for (int i = 0; i < count; i++) {
                poweredDigit *= digit;
            }
             newNum = newNum + poweredDigit;
             num /= 10;
        }

        if(newNum == dummy){
            System.out.print("Its Armstrong Num");
        }else{
            System.out.print("Its not an Armstrong Num");
        }
    }
}