public class loopspractice {
    public static void main(String[] args) {
    for(int i =10;i<=15;i++ ){
        for(int j=10;j<=i;j++){
            System.out.print("* ");

        }
        System.out.println();
            
    }

    for(int l = 0;l<=3;l++){
        for(int m = 0;m<=0;m++){
            System.out.print("****");
        }
        System.out.println();
    }

    for(int x = 0;x<=4;x++){
        for(int y = 0;y<=0;y++ ){
            System.out.println("* * * * * ");
        }
        System.out.println("    *");    
    }

    for(int o = 0;o<=4;o++){
        for(int p=4;p>=o;p--){
            System.out.print("*");
        }
        System.out.println();
    }

    // for(int w = 0;w<=3;w++){
    //     for(int e = 0;e<=0;e++){
    //         int g =1111;
    //         System.out.println( "1111");

    //     }
         
    // }

    //print pattern 1111222233334444 using loops
    for (int num1 = 1; num1 <= 4; num1++) {
        for (int count1 = 1; count1 <= 4; count1++) {
            System.out.print(num1);
        }
    }
    System.out.println();

    // print pattern 1111222233334444 using loops
    for (int num = 1; num <= 4; num++) {
        for (int count = 1; count <= 4; count++) {
        System.out.println(num);
    }
}
       System.out.println();

       
    // for(int w = 0;w<=0;w++){
    //     for(int e = 0;e<=0;e++){
    //         int g =1111;
    //         System.out.println( "1111");
    //         for(int h = 0;h<=0;h++){
    //             System.out.println("2222");
    //             for(int k = 0;k<=0;k++){
    //                 System.out.println("3333");
    //                 for(int m = 0;m<=0;m++){
    //                     System.out.println("4444");
    //                 }
    //             }
    //         }

    //     }
         
    // }

    for(int w = 0;w<=0;w++){
         for(int e = 0;e<=0;e++){
             
             System.out.println( """
                1111
                2222
                3333
                4444""");
             }
             System.out.println();
            }


            //Butterfly pattern
            //n = 4

            //1  1star  6space  1 star
            //2 2star  4space  2 star
            //3 3star  2space  3 star
            //4 4star  0space  4 star

            /* i=1      2*3  |  --> n-i
               i=2      2*2  |  --> n-i
               i=3      2*1  |  --> n-i
               i=4      2*0  |  --> n-i
                    Space = 2*(n-i)
               */
              //first upper half

              int n =5;


                for(int t =1;t<=n; t++ ){
                    //first part
                    for(int m =1;m<=t;m++){
                        System.out.print("*");
                    }

                    //Spaces
                    int space = 2 * (n-t);
                    for(int r = 1;r<=space;r++ ){
                        System.out.println(" ");
                    }
                    }

                }

            



            
        }
    

    



