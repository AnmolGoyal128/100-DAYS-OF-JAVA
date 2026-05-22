public class OOP5 {
    public static void main(String[] args) {

        // Students1 s1 = new Students1();
        // Students1 s2 = new Students1();

        Students1 s1 = new Students1();
        // Students s2 = new Students("Rohit");
        // Students s3 = new Students("Aditya",43);
        // Students s4 = new Students("Rohan",56,123);
        // Students s5 = new Students("Mohan",67,142,"IIT Bombay");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.Collage);

        // System.out.println(s2.name);
        // System.out.println(s2.age);
        // System.out.println(s2.rollNum);
        // System.out.println(s2.Collage);
    }
}
class Students1{  
    String name;  
    int age;
    int rollNum;
    String Collage;

    //Constructor Chaining 

    Students1(){
        // this("Unknown",0,0,"Unknown");
        this("Unknown");
         System.out.println("I am in first constructor");;

    }
    Students1(String name){
        // this(name,0,0,"Unknown");
        this(name,0);
        System.out.println("I am in second constructor");

    }
    Students1(String name,int age){
        //this(name,age,0,"Unknown");
        this(name,age,0);
        System.out.println("I am in third constructor");

    }
    Students1(String name,int age,int rollNum){
        //this(name,age,rollNum,Collage);
        this(name,age,rollNum,"Unknown");
        System.out.println("I am in fourth constructor");
    }
    Students1(String name,int age,int rollNum,String Collage){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.Collage = Collage;
        System.out.println("I am in fifth constructor");
    }

    void markAttendence(){   //behaviour-->function-->instance method
        System.out.println("Attendence is marked by "+name);

    }
}
