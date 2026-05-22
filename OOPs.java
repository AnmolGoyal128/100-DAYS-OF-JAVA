public class OOPs {   //Java is almost a object oriented language
    public static void main(String[] args) { //main function
        student s1 = new student();
        student s2 = new student();

        s1.name = "Aditya";
        s1.College = "IIT ";
        s1.age = 23;
        s1.rollNumber = 345678;

        s2.name = "Rohit";
        s2.College = "IIT ";
        s2.age = 22;
        s2.rollNumber = 345679;

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();

        
        
    }
}

//class formation out of outer most bracket
class student{
    String name;
    int age;
    int rollNumber;
    String College;

    void markAttendence(){
        System.out.println("Attendence marked by "+ name);
    }
    void print(){
       System.out.println(name+","+age+","+rollNumber+","+College);
    }

     
}
