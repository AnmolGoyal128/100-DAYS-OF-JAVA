public class statics {
   public static void main(String[] args) {



        //Static keyword
        student s1 = new student("aditya",45,123);
        student s2 = new student("rohit",45,456);

        // student.college = "IIT Guwahati";

        System.out.println(s1.name+","+s1.age+","+s1.rollNum+","+student.college);
        System.out.println(s2.name+","+s2.age+","+s2.rollNum+","+student.college);





    }
}
class student {
    String name;
    int age;
    int rollNum;
    static String college;    // static String college = "IIT G";
    static String grade;

    student(String name,int age,int rollNum){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    //static block
    static{
        college = "IIT Guwahati";
        grade = "B";
    }


    
}
