public class OOP4 {

    public static void main(String[] args) {
<<<<<<< HEAD
        new ConstructorStudent();
        new ConstructorStudent("Rohit");
        ConstructorStudent s3 = new ConstructorStudent("Aditya",43);
        new ConstructorStudent("Rohan",56,123);
        new ConstructorStudent("Mohan",67,142,"IIT Bombay");
=======
        Students s1 = new Students();
        Students s2 = new Students("Rohit");
        Students s3 = new Students("Aditya",43);
        Students s4 = new Students("Rohan",56,123);
        Students s5 = new Students("Mohan",67,142,"IIT Bombay");
>>>>>>> origin/main

        System.out.println(s3.name);




        
    }
}
        
<<<<<<< HEAD
class ConstructorStudent{  
=======
class Students{  
>>>>>>> origin/main
    String name;  
    int age;
    int rollNum;
    String Collage;

    //Constructor Overloading 

<<<<<<< HEAD
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
=======
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
>>>>>>> origin/main
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }
<<<<<<< HEAD
    ConstructorStudent(String name,int age,int rollNum,String Collage){
=======
    Students(String name,int age,int rollNum,String Collage){
>>>>>>> origin/main
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.Collage = Collage;
    }

    void markAttendence(){   //behaviour-->function-->instance method
        System.out.println("Attendence is marked by "+name);

    }
}
    
