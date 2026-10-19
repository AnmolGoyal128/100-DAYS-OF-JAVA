public class OOPs3 {
    public static void main(String[] args) {

<<<<<<< HEAD
        OOPStudent s1 = new OOPStudent();
=======
        Student s1 = new Student();
>>>>>>> origin/main

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.Collage);

<<<<<<< HEAD
        OOPStudent s2 = new OOPStudent("Rohit",32,102,"IIT");
=======
        Student s2 = new Student("Rohit",32,102,"IIT");
>>>>>>> origin/main

        
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNum);
        System.out.println(s2.Collage);

       

        
    }
}
<<<<<<< HEAD
class OOPStudent{    
=======
class Student{    
>>>>>>> origin/main
    String name;    
    int age;
    int rollNum;
    String Collage;

<<<<<<< HEAD
    OOPStudent(){
=======
    Student(){
>>>>>>> origin/main
        name = "Aditya";   
        age = 34;
        rollNum = 53672;
        Collage = "iit";
        
    }

<<<<<<< HEAD
    OOPStudent(String n,int a,int rn,String c){
=======
    Student(String n,int a,int rn,String c){
>>>>>>> origin/main
        name = n;
        age = a;
        rollNum = rn;;
        Collage = c;


    }

    void markAttendence(){   //behaviour-->function-->instance method
        System.out.println("Attendence is marked by "+name);

    }

    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

}
