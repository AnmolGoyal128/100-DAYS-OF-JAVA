public class OOP4 {

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("Rohit");
        Students s3 = new Students("Aditya",43);
        Students s4 = new Students("Rohan",56,123);
        Students s5 = new Students("Mohan",67,142,"IIT Bombay");

        System.out.println(s3.name);




        
    }
}
        
class Students{  
    String name;  
    int age;
    int rollNum;
    String Collage;

    //Constructor Overloading 

    Students(){

    }
    Students(String name){
        this.name = name;

    }
    Students(String name,int age){
        this.name = name;
        this.age = age;
    }
    Students(String name,int age,int rollNum){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }
    Students(String name,int age,int rollNum,String Collage){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.Collage = Collage;
    }

    void markAttendence(){   //behaviour-->function-->instance method
        System.out.println("Attendence is marked by "+name);

    }
}
    
