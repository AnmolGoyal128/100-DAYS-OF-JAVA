public class Functions2 {
    public static void main(String[] args) {
        //Functin Overloading

        int x = sum(4, 7);
        System.out.println(x);

        int y = sum(23, 45);
        System.out.println(y);

        int z = sum(3, 6, 7);
        System.out.println(z);

        greet(" Aditya",43);
        greet("Abhimanue", 34);

        fun();
        fun1();




    }
    static int sum(int a,int b){
        return(a + b);
    }

    static int sum(int a,int b,int c){  //We can give it the same name like sum 
        //sum2 add both number in sum 1 + int c ower compiler differ both of them by itself no the basis of no of arggumet 
        return(a+b+c);
    }

    static int sum(double a , double b){
        return(int)(a + b);  //Different types of parameter


    }
    static void greet(String name ,int age){    //Different order of parameter
        System.out.println("Hi"+name+"Your age is "+ age);
    }

    static void greet(int age,string name){
        System.out.println("Hi"+name+"Your age is "+ age);
    }

    static void fun(){
        System.out.println("Hello"); 
    }                                    //Throw error if different or same Ouptut data type 
                                         
    static int fun1(){
        System.out.println("Hello");
        return 5;
    }
}
