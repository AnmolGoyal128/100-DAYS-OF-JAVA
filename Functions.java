public class Functions {
    public static void main(String[] args) {
        //Functions in jaVA

        greet();
        SayHello("Aditya");//Argument

        getnumber();  //Nothing will happen no assignment
       System.out.println(getnumber());

       System.out.println(multiply(2,4));

       return;  //Optional

    }


    //NO IP,NO OP

    static void  greet(){
        System.out.println("Hello");
        return;   //Optional
    }

    //IP,NO OP

    static void SayHello(String name){   //Number of parameter can be anything
        System.out.println("Hello "+ name);
        return;
    }

    //No IP,OP
    static int getnumber(){
        return 10;
    }

    //IP ,OP
    static int multiply(int a, int b){
        return(a*b);
    }
}



