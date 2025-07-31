class Reverse{
    public static void main(String[] args) {
        int n = -123;
        int rev = 0;
        while(n > 0){
            int val = n%10;
            rev = val + 10 *rev;
            n /= 10;
        }
        System.out.print(rev);
    }
}