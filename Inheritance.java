public class Inheritance {
    public static void main(String[] args) {

        InheritanceEngineeringStudent es = new InheritanceEngineeringStudent();
        es.markAttendence();
        es.attendllab();

        InheritanceStudent s1 = new InheritanceStudent();
        s1.markAttendence();
        //s1.attendlab(); //Not possible as it is written in EngenneringStudent class it can access ony in Student class 
        
    }
}
/*
parent child relationship
Not Child parent 
*/

class InheritanceStudent{
    String name;
    int age;

    public void markAttendence(){
        System.out.println("Attendence marked");
    }
}
class InheritanceEngineeringStudent extends InheritanceStudent{
    void attendllab(){
        System.out.println("Lab Attended");
    }
}
