public class loops {
    public static void main(String[] args) {

        //loops

        int i =8;
        System.out.println(i);
        int k = i++;
        System.out.println(k);
        int k1 = i++;
        System.out.println(k1);
        i++;

        int z = 6;
        z++; // i = i+1 -->i +=1; 
        System.out.println(z);

        //while (condition) { //boolean-->true/false
            //do something
        int q=12;
           while (q<=19) {  //while means jab tak ye condition true nahi hoti tab tak andar vale kaam ko karte raho
              System.out.println(q);  //infinite loop no end condition  
              q++;    //finite loop end condition
        } 
         int a=20;
        while (a>=19) {  //while means jab tak ye condition true nahi hoti tab tak andar vale kaam ko karte raho
              System.out.println(a);  //infinite loop no end condition  
              a--;
        } 

         int l=1;
        while (l++ <=10) {  //while means jab tak ye condition true nahi hoti tab tak andar vale kaam ko karte raho
              System.out.println(l);  //infinite loop no end condition  
              //l++;
        }
        //above will print from 2 to 10 not 1 to 11
        //print line execute hone se pehele hi hamara 1 2 ho chuka hoga isliye 2 to 11 print hoga

        //Best method to print 1 to 10
        int w=0;
        while (w++ <10) {  //while means jab tak ye condition true nahi hoti tab tak andar vale kaam ko karte raho
              System.out.println(w);  //infinite loop no end condition  
              //w++;

        }


        //do while loop
        /*in do while loop first work is to do some work then check conditions
        after checking the condition if its true then do that work again again again */
        /*do{
            do something
        } while(expression);
        */
        int t=30;
        do{
            System.out.println(t); //even if the condition in while loop does not possible or exist the initial value will be printed
            t--;
        }while(t>0);

        //WHY?
        /*menue item selection -->do-while execute initial term even if condition is true or false
            play game
            return saved game
            Exit
         */
        //for loop

        /*
        for(initialization; condition; increment /decrement){
           do something
        } */


        //1to 30
        for(int s=1; s<=30; s++){ //bolean-->true/false
            System.out.println(s);
        }
        /*
            Flow of control in for loop
            1. first assignment statement is executed (variable defination)
            2.Then second conditional statements is evaluated  .(true/false)
            3.If true ,control flow will evaluated the body of the loop.
            3.if true the control flow will evaluate the body of the loop
            4.once loop body is executed ,control floe will go to the increment/decrement statement
            5.Again ,conditional statement will be evaluated
            6.repeat 2 to 5
             */

            for(int d=30; d>=1; d--){ //bolean-->true/false
            System.out.println(d);
        }
        for(int d=38,o=12;d<=50;d++,o++){
            System.out.println(d * o);

        }
        //for(int p=38,g=12;p<=50;p++,g+=2){
          //  System.out.println(p * g);

        //}
        for(int p=38,g=12;p<=50 && g<=16 ;p++,g+=2){
            System.out.println(p * g);

        }
        //booolea b = true/false
       // for(int p=38; b == true ;p++){
         //   if(condition){
           //     b = false;
            //}
            //System.out.println(p);

        //}

        //integer -->byte, short, int, long
        for(int y=1; y<=10; y++){       //for loop me int ke alawa byte, short, long bhi use kar sakte hai
            System.out.println(y);      //we generally use int in for loop because its range is more than byte and short and long is not used because it takes more memory than int
        }                               //because it type promates to int in for loop

        //Nested for loop
        for(int m=1; m<=3; m++){
            for(int n=1; n<=3; n++){
                System.out.println(m + "," + n);
            }
        }
        /*
        *
        * *
        * * *
        * * * *
        * * * * * */

        for(int u=1 ;u<=10;u++){
            for(int v = 1; v<=u;v++){
                System.out.print("* ");
            }
           System.out.println();
        }
            

        //for-each loop
    }
            
}

 