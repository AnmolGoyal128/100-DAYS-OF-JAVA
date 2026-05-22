public class OOPs2 {
    public static void main(String[] args) {

        students s1 = new students();

        s1.name = "Aditya";
        s1.age = 34;
        s1.Collage = "iit";
        s1.rollNum = 53672;

        
         //Default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.Collage);
       
        //int x ; //local variable -->No default values -->Stores in STACK MEMORY
        //System.out.println(x);  //Throw error as value of x is not initialised 
        
    }

    void fun(){  //To optimised to java language there is no default values assosiated with local variables
                 // as there is high chance of that a class will stay for a long time in memory 
       // int x;
    }
}

/*
Integer-->0
floating -->0.0
Boolean -->false
String -->null (nothing) */
class students{    //Stores in HEAP MEMORY
    String name;    //information/data/characteristics -->Instance variable
    int age;
    int rollNum;
    String Collage;

    void markAttendence(){   //behaviour-->function-->instance method
        System.out.println("Attendence is marked by "+name);

    }
    void emotion(){
        System.out.println(name+" is very happy");
    }

}
