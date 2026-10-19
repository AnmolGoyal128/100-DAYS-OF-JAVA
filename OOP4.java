public class OOP4 {

    public static void main(String[] args) {
        new ConstructorStudent();
        new ConstructorStudent("Rohit");
        ConstructorStudent s3 = new ConstructorStudent("Aditya",43);
        new ConstructorStudent("Rohan",56,123);
        new ConstructorStudent("Mohan",67,142,"IIT Bombay");

        System.out.println(s3.name);




        
    }
}
        
class ConstructorStudent{  
    String name;  
    int age;
    int rollNum;
    String Collage;

    //Constructor Overloading 

    ConstructorStudent(){

    }
    ConstructorStudent(String name){
        this.name = name;

    }
    ConstructorStudent(String name,int age){
        this.name = name;
        this.age = age;
    }
    ConstructorStudent(String name,int age,int rollNum){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }
    ConstructorStudent(String name,int age,int rollNum,String Collage){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.Collage = Collage;
    }

    void markAttendence(){   //behaviour-->function-->instance method
        System.out.println("Attendence is marked by "+name);

    }
}
    
