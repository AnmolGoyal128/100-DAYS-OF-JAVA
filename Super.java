public class Super {
    public static void main(String[] args) {

        // EngeneeringStudent es = new EngeneeringStudent();
        // es.age = 23;
        // es.college = "IIT G";
        // es.name = "abnhdu";
        // es.rollNum = 12345678;
        // es.print();
        
        EngeneeringStudent es2 = new EngeneeringStudent("anhyt",57,453638,"IIT G");
        es2.print();
    }
}
class student{
    String name;
    int age;
    int rollNum;
    int X;

    student(){

    }


    student(String name,int age,int rollNum) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    void print(){
        System.out.println(name+","+age+","+rollNum);

    }
}
class EngeneeringStudent extends student{
    String college;

    EngeneeringStudent(String name,int age,int rollNum,String college){
        super(name,age,rollNum);
        // this.name = name;
        // this.age = age;
        // this.rollNum = rollNum;        //No need as we call it thru super
        this.college = college;
    }

    void print(){

        super.print();
        System.out.println(college);

        //System.out.println(super.name+","+super.age+","+super.rollNum+","+ super.X);
    }                       //|                |
}                                 //Optional    
