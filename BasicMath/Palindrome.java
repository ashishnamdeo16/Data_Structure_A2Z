class Palindrome{
    public static void main(String[] args) {
        int n = 12211;
        int rev = 0;
        int k = n;
        while(n > 0){
            int val = n%10;
            rev = val + 10 *rev;
            n /= 10;
        }
        if(k == rev){
            System.out.print( k + " Its a Palindrom No");
        }else{
            System.out.print(k + " Not A Palindrome No");
        }

    }
}