public class OOPs3 {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.Collage);

        Student s2 = new Student("Rohit",32,102,"IIT");

        
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNum);
        System.out.println(s2.Collage);

       

        
    }
}
class Student{    
    String name;    
    int age;
    int rollNum;
    String Collage;

    Student(){
        name = "Aditya";   
        age = 34;
        rollNum = 53672;
        Collage = "iit";
        
    }

    Student(String n,int a,int rn,String c){
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
