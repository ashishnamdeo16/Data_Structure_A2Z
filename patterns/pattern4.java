class pattern4{
    public static void main(String[] args) {
    for(int i=0;i<5;i++){
        for(int j=5;j>i;j--){
            System.out.print(" ");
        }
        for(int k=(2*i)+1;k>0;k--){
            System.out.print("*");
        }
        System.out.println("");
    }
        for(int l=5-2;l>=0;l--){
            for(int m=5;m>l+1;m--){
                System.out.print("*");
            }
            for(int n=0;n<2*l+1;n++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}