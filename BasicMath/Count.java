class Count{
    public static void main(String[] args) {
        int a = 11239;
        int count = 0;
        while(a > 0){
            count++;
            a /= 10;
        }
        System.out.print(count);
    }
}