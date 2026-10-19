public class OOPs3 {
    public static void main(String[] args) {

        OOPStudent s1 = new OOPStudent();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.Collage);

        OOPStudent s2 = new OOPStudent("Rohit",32,102,"IIT");

        
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNum);
        System.out.println(s2.Collage);

       

        
    }
}
class OOPStudent{    
    String name;    
    int age;
    int rollNum;
    String Collage;

    OOPStudent(){
        name = "Aditya";   
        age = 34;
        rollNum = 53672;
        Collage = "iit";
        
    }

    OOPStudent(String n,int a,int rn,String c){
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
