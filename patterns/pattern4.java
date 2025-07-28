class pattern4{
    public static void main(String[] args) {
        //Pattern 22
        //To be Done
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0 || i==6){
                    System.out.print("4");
                }else if(i==1){
                    System.out.print("3");
                }
            }
            System.out.println();
        }


        //Pattern 21
//        for(int i=0;i<4;i++){
//            System.out.print("*");
//            if (i == 3 || i==0) {
//                for(int j=0;j<2;j++){
//                    System.out.print("*");
//                }
//            }else if(i==1 || i==2){
//                for(int k=0;k<2;k++){
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("*");
//            System.out.println();
//        }


        //Pattern 20
//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int k=8-2*i;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int k=0;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<4;i++){
//            for(int j=4-i;j>0;j--){
//                System.out.print("*");
//            }
//            for(int k=2+2*i;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int j=4-i;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern 19
//        for(int i=0;i<5;i++){
//            for(int j=5;j>i;j--){
//                System.out.print("*");
//            }
//            for(int k=2*i;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int m=5;m>i;m--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int k=8-2*i;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int k=0;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern 18
//        for(char i='E';i>='A';i--){
//            for(char ch=i;ch<='E';ch++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        //Pattern 17
//        for( int i=0;i<4;i++){
//            for(int j=3-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for(char ch ='A';ch<='A'+i;ch++){
//                System.out.print(ch);
//            }
//
//            for(char ch= (char) ('A'+i-1) ;ch>='A';ch--){
//                System.out.print(ch);
//            }
//
//            System.out.println();
//        }


        //Pattern 16
//        for(int i=0;i<5;i++){
//            char ch = (char) ('A' + i);
//            for(int j = 0; j <= i; j++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }


        //Pattern 15
//        for(int i=5;i>0;i--){
//            for(char j='A';j<'A'+i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //Pattern 14
//        for(int i=0;i<5;i++){
//            for(char j='A';j<='A'+i;j++){
//                System.out.print(j);
//            }
//         System.out.println();
//        }


        //Pattern 13
//        int num =1;
//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(num++);
//            }
//            System.out.println();
//        }

        //Pattern 12
//        for(int i=0;i<4;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(j+1);
//            }
//            for(int k=6-(2*i);k>0;k--){
//                System.out.print(" ");
//            }
//            for(int l=i+1;l>0;l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

        //Pattern 11
//       for(int i=0;i<5;i++){
//           for(int j=0;j<=i;j++){
//               if((j+i) % 2 == 0 ){
//                   System.out.print("1");
//               }else{
//                   System.out.print("0");
//               }
//           }
//           System.out.println();
//       }

     //Pattern 10
//     for(int i=0;i<5;i++){
//         for(int j=i+1;j>0;j--){
//             System.out.print("*");
//         }
//         System.out.println("");
//     }
//        for(int i=0;i<4;i++){
//            for(int j=4-i;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



    //Pattern9
//    for(int i=0;i<5;i++){
//        for(int j=5;j>i;j--){
//            System.out.print(" ");
//        }
//        for(int k=(2*i)+1;k>0;k--){
//            System.out.print("*");
//        }
//        System.out.println("");
//    }
//        for(int l=5;l>0;l--){
//            for(int m=6-l;m>0;m--){
//                System.out.print(" ");
//            }
//            for(int n=0;n<2*l-1;n++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }

}