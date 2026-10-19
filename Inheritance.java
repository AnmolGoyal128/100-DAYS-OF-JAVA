public class Inheritance {
    public static void main(String[] args) {

<<<<<<< HEAD
        InheritanceEngineeringStudent es = new InheritanceEngineeringStudent();
        es.markAttendence();
        es.attendllab();

        InheritanceStudent s1 = new InheritanceStudent();
=======
        EngenneringStudent es = new EngenneringStudent();
        es.markAttendence();
        es.attendllab();

        Student s1 = new Student();
>>>>>>> origin/main
        s1.markAttendence();
        //s1.attendlab(); //Not possible as it is written in EngenneringStudent class it can access ony in Student class 
        
    }
}
/*
parent child relationship
Not Child parent 
*/

<<<<<<< HEAD
class InheritanceStudent{
=======
class Student{
>>>>>>> origin/main
    String name;
    int age;

    public void markAttendence(){
        System.out.println("Attendence marked");
    }
}
<<<<<<< HEAD
class InheritanceEngineeringStudent extends InheritanceStudent{
=======
class EngenneringStudent extends Student{
>>>>>>> origin/main
    void attendllab(){
        System.out.println("Lab Attended");
    }
}
