class SumOFnumbers{
    public static void main(String[] args) {
        int n = 5;
        int res = sumOfN(n);
        System.out.print(res);
    }

    public static int sumOfN(int n){
        if(n == 0){
            return 0;
        }
        return sumOfN(n-1) + n;
    }
}