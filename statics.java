public class statics {
   public static void main(String[] args) {



        //Static keyword
        StaticStudent s1 = new StaticStudent("aditya",45,123);
        StaticStudent s2 = new StaticStudent("rohit",45,456);

        // student.college = "IIT Guwahati";

        System.out.println(s1.name+","+s1.age+","+s1.rollNum+","+StaticStudent.college);
        System.out.println(s2.name+","+s2.age+","+s2.rollNum+","+StaticStudent.college);





    }
}
class StaticStudent {
    String name;
    int age;
    int rollNum;
    static String college;    // static String college = "IIT G";
    static String grade;

    StaticStudent(String name,int age,int rollNum){
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
