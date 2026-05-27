public class Demo3 {
    public static void main(String[] args) {
        A a = new B();    //a is reference of A so when we call a fun of A is printed 
        a.fun();

        D d = new E();
        //System.out.println(d.x);
        System.out.println(d.getx());


        
    }
}
//static --> they belongs to class and not to objct
//private --> methods can not be overridden child class can not access private method of other class
 //final --> methods can not be override

 //Fields/Variables they can not be polymorphic

 //final -->class?? -->you cannot create child of that class 
class A {
    static void fun(){
        System.out.println("Hello");
    }

    private void fun2(){
        System.out.println("Hello2");
    }

    final void fun3(){
        System.out.println("Hello4");
    }
}
class B extends A{
    // void fun(){}   //Bye
    static void fun(){
        System.out.println("Bye");
    }

    private void fun2(){
        System.out.println("Hello3");
    }
    // final void fun3(){
    //     System.out.println("Hello4");
    // }
}
class D{
    //int x = 10;
    int getx(){
        return 12;
    }
}
class E extends D{
    //int x = 20;
    int getx(){
        return 10;
        }
}

final class F{
    //int x = 10;
    int getx(){
        return 12;
    }
}
final class g extends D{
    //int x = 20;
    int getx(){
        return 10;
        }
}
