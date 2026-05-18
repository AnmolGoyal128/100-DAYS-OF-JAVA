public class jumpstatements {
    public static void main(String[] args) {
        // Jump statements in Java
        // break,continue

        for(int i = 1; i<=10;i++){
            System.out.println(i); //print 1 to 10

            // I need to print no.from 1 to 5 without changing in loop conditions 

            if(i>4){   //Checks if 5>4 after this conditions will break
                break;
            }
        }

        //whether a number is prime or not
        int p = 9;
        for(int i =2;i<p;i++){
            if(p%i==0){
                System.out.println("The number is not prime");
                break;  // Exit flow of control from loop
            }
        }
        int g;
        int x = 7;
        for(g =2;g<x;g++){
            if(x%g==0){
                System.out.println("The number is not prime");
                break;
            }
        }
        if(x==g){
            System.out.println("The number is prime number");
        }
        //Continue

        for(int h = 1;h<=10;h++){
            if(h % 2!=0){
                System.out.println(h);            }
        }
        for(int l = 1;l<=10;l++){
            if(l % 2==0){
                continue;  //is iteration ki yahi tak rakho fir dusari iteration me chalejao
            }

                System.out.println(l);
             
        }

        //Break and Continue in Nested Loops

         for(int u=1 ;u<=10;u++){
            for(int v = 1; v<=u;v++){
                System.out.print("* ");

                if(v>=5){
                    break;

                }
            }
           System.out.println();
        }
        /*
        *
        **
        ***
        ****
        *****
        *****
        *****
        *****
        *****
        ***** */
       outer : for(int u=1 ;u<=10;u++){
            inner: for(int v = 1; v<=u;v++){
                System.out.print("* ");

                if(v>=5){
                    continue;

                }
            }
           System.out.println();
        }



    

    }
}
