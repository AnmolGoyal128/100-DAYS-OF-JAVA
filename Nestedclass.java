public class Nestedclass {
    public static void main(String[] args) {
<<<<<<< HEAD
        NestedOuter outer = new NestedOuter();
        NestedOuter.inner Inner = new NestedOuter.inner();  //here we forn object of inner class without formatiom of Outer class object
=======
        Outer outer = new Outer();
        Outer.inner Inner = new Outer.inner();  //here we forn object of inner class without formatiom of Outer class object
>>>>>>> origin/main
        Inner.fun(outer);
    }
}
//static nested
<<<<<<< HEAD
class NestedOuter{
=======
class Outer{
>>>>>>> origin/main

   static int x = 67;
   int y =56;

   static void fun(){

   }
   
    
    static class inner{       //it is same for all member of outer class as statics variable is common for whole class
<<<<<<< HEAD
        void fun(NestedOuter outer){
=======
        void fun(Outer outer){
>>>>>>> origin/main
            System.out.println("hello");
            System.out.println(x);
            System.out.println(outer.y);  //through this mathod we can call non static variable of outer class
           //System.out.println(y);   it shows error as static class can access only static variable of Outer classs
        }


    }
}
