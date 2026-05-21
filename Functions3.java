public class Functions3 {

    //Global Scope

    static String name = "aditya";
    public static void main(String[] args) {
        // Chaining of function

        fun1();
        System.out.println("BYE");

        //Scope of a variable-->under the scope of curly bracket
        int x = 23;  //local scope
        int y = 45;
        System.out.println(x + " , " + y);

        fun4();

        

        

    }
    static void fun1(){
        fun2();
        System.out.println("helllo");
    }
    static void fun2(){
        fun3();
        System.out.println("Hi");
    }

    static void fun3(){
        System.out.println("How are you");
    }
    // static void fun4(){
    //     System.out.println(x+","+y);   //its scope is only in its curly bracket so it will give error wh have again define all the variables
    //}
    static void fun4(){
        int x = 3;  //local scope
        int y = 4;
        System.out.println(x+","+y);
    }

}
