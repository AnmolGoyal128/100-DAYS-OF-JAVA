public class staticNested {
    public static void main(String[] args) {

        StaticNestedOuter outer = new StaticNestedOuter();

        StaticNestedOuter.Inner inner = new StaticNestedOuter.Inner(outer);
        inner.display();

        Outer outerInstance = new Outer();

        Outer.Inner2 inner2 = outerInstance.new Inner2(); // Creating an instance of the inner class
        inner2.fun(); // Calling the method of the inner class

        // Creating an instance of the inner class without outer class reference

        // AAlternate way to create an instance of the inner class without outer class reference
        Outer.Inner2 inner3 = new Outer().new Inner2(); // Creating an instance of the inner class without outer class reference
        inner3.fun(); // Calling the method of the inner class

        inner2.staticFun(); // Calling the static method of the inner class
        Outer.Inner2.staticFun(); // Calling the static method of the inner class without creating an instance
    
    
        Outer3 outer3 = new Outer3();
        outer3.great(); // Calling the method of the outer class which contains a local class

    
    }

}
// Static nested class
class StaticNestedOuter{

    static int x = 9;
    int y;

    
    

    static class Inner{

        StaticNestedOuter outer;
        private String name;
        private int age;
        Inner (StaticNestedOuter outer) {
            this.outer = outer;
        }


        void display() {
            System.out.println("This is a static nested class");
            System.out.println("Static variable x: " + x);
            //System.out.println("Non-static variable y: " + y); // Accessing non-static variable through outer class instance
            System.out.println("Outer class instance: " + outer.y);   }   


    }

}

class BankAccount {

    static class INterestCalculator {
        static double CalculateYearlyInterest(double principal, double rate) {
            return (principal * rate) / 100;
        }
    }
    public static double computeInterest(double principal) {
        return INterestCalculator.CalculateYearlyInterest(principal, 0.09);


    }
}

// Use cases of static nested classes

// 1. As Helper class for any outer class
// 2. for Builder design pattern
// 3. if you want static method inside a nested class
// 4. Request Response DTO (Data Transfer Object) pattern

//========================================================================

// Inner class

class Outer{

    int x = 10;

    class Inner2{

        // Inter class can access outer class variables and methods directly
        // internally
        // Outer outer;

        int x = 20;
        void fun(){
            System.out.println("This is an inner class");
            System.out.println("Value of x: " + x);
            System.out.println("Value of outer class x: " + Outer.this.x); // Accessing outer class variable using Outer.this
        }

        static void staticFun() {
            System.out.println("This is a static method inside an inner class");
        }

        // Upto java 16, inner classes cannot have static methods or static variables.

    }
}

// =========================================================================================================================================

// Local class

// Effectively final variable: A local variable that is not modified after its initial assignment. In Java 8 and later, local classes can access effectively final variables from the enclosing method.

class Outer3{

    private int x2 = 10;

    void great(){
        System.out.println("This is an outer class method");
        int z = 5; // Local variable
       // z++; // Modifying the local variable z

        class Local{
            
            void fun8(){
                int y = 4;
                y++;

                System.out.println("This is a local class method");
                System.out.println("Value of x2: " + x2);
                System.out.println("Value of y: " + y);
                System.out.println("Value of z: " + z); // Accessing effectively final variable from the enclosing method
            }
        }

        Local local = new Local();
        local.fun8();
    }
}
/*
 Constructor
 Method
 if
 loops
 static blocks
*/