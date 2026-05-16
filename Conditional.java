public class Conditional {
    public static void main(String[] args) {
         int i=4;
         //selection statements 
         //Normal if

         if(i == 10){
            System.out.println("i is 10");


         }else{
            System.out.println("i is not 10");
         }
         //System.out.println("i is not 10");

         if(i>5 && i<10){
            System.out.println("i lie between 5 and 10");
         }else{
            System.out.println("i is out of range");
         }

         int k = 3;

         if(k % 2 == 0){
            System.out.println("the no is even no.");

         }else{
            System.out.println("the number is odd no.");
         }

         //Nested ifs

         if(k<10){
            if (k<4){
                if(k == 3){
                    System.out.println("the value of k is equal to 3 ");

                }

            }else{
                System.out.println("the value of k is greater then 4");

            }
         }else{
            System.out.println("the value of k is greater than 10");

         }

        if(k <10 && k<4 && k==3){
            System.out.println("the value of k is equal to 3");

        }else{
            System.out.println("the value of k is not equal to 3");
        }

       // boolean b = true;
        int j = 12;

        //if else if ladder
        if(j==1){
            System.out.println("the value of j is equal to 1");
        }
        else if(j==2){
            System.out.println("the value of j is equal to 2");
        }
        else if (j==3) {
             System.out.println("the value of j is equal to 3");
        }
        else if (j==4) {
             System.out.println("the value of j is equal to 4");
        }
        else if (j==5) {
             System.out.println("the value of j is equal to 5");
        }else if (j==6) {
             System.out.println("the value of j is equal to 6");
        }
        else{
            System.out.println("the value of j is greater then 6 OR less than 1");
        }
        //if any one condition become truethen below that condition is not checked

        if(j==1){
            System.out.println("the value of j is equal to 1");
        }
        if(j>12){
            System.out.println("the value of j is greater than 12 ");
        }
        if (j>11) {
             System.out.println("the value of j is greater than 11 ");
        }
        if (j>10) {
             System.out.println("the value of j is greater than 10");
        }
        if (j>8) {
             System.out.println("the value of j is greater than 8");
        }
        if (j>5){

        
             System.out.println("the value of j is greater than 5");
        }
        else{
            System.out.println("the value of j is less then 5 ");
        }
        // if ladder checks all conditions even if above that conditions are true it will also check the below conditions
        
         // Switch statements

         int z = 3;
         switch (z) {
            case 1:
                System.out.println("the value of z is 1");
                break;
            case 2:
                System.out.println("the value of z is 2");
                break;
            case 3:
                System.out.println("the value of z is 3");
                break;
            default:
                System.out.println("the value of z is not 1, 2, or 3");
                break;
         }
         // Need of Break in switch statement--> if we not use break then all the cases below the true case will also execute it stops comparision and executes all statements
          int l= 1;
         switch (l) { // switch(expression)-->byte,short,int,char,Enumeration valid only for these case
            case 1:
                System.out.println("the value of l is 1");
                
            case 2:
                System.out.println("the value of l is 2");
                
            case 3:
                System.out.println("the value of l is 3");
                
            default:
                System.out.println("the value of l is not 1, 2, or 3");
                break;
         } 
         //all cases should not be same
         //switch-->limited use cases -->should evaluate to byte,int,short,char,Enumeration
         //After JDK 7 strings can also be used as switch expression
         //After JDK 14 Switch is enhanced to much

         //int p = 2;
         int q = 5;

         switch (q) {
            case 4:
                System.out.println("q is 4");
                break;
            case 5:
                switch (k) {
                    case 1:
                        switch ((j)) {
                            
                             
                }
                System.out.println("q is 5");
                
            }
        }

    }
}
