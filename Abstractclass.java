public class Abstractclass {
    public static void main(String[] args) {

       // Animal a = new Animal() {
        Animal a = new Dog(); 
            a.makeSound();
        
        
    }
}

abstract class Animal {
    abstract void makeSound();

    void sleep(){
        System.out.println("sleeping");
    }
}

class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("Making barking sound");

    }

}

//Abstract classes
//1.Cannot be instantiated directly
//2.can contain abstract method (method without implementation)
//3.can also contain normal method
//4.is meant to be extended 


//Interview Questions
//1.Constructor ??     -->  yes possible because of child class we can call constructor of parent class from child class thru super
//2. can abstract classes be final -->NO oxymoronic
//3.can abstract class has static methos -->as static method is link with class not abject 
                                                // it is possible static method ,static block all are passible 
//4. can private method are allowed -->yes  but private method can not be abstract as private can not be assesible by child class due to private but abstract class can be assesed by child class 
//5.can abstract classes have final method -->yes   as final method can not be override 
//final can never be abstract --> as abstract override
//6. can abstract class have no abstract method --> allowed because we want no one can make direct object of that but we define it

