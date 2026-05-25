public class Inheritance {
    public static void main(String[] args) {

        EngenneringStudent es = new EngenneringStudent();
        es.markAttendence();
        es.attendllab();

        Student s1 = new Student();
        s1.markAttendence();
        //s1.attendlab(); //Not possible as it is written in EngenneringStudent class it can access ony in Student class 
        
    }
}
/*
parent child relationship
Not Child parent 
*/

class Student{
    String name;
    int age;

    public void markAttendence(){
        System.out.println("Attendence marked");
    }
}
class EngenneringStudent extends Student{
    void attendllab(){
        System.out.println("Lab Attended");
    }
}
