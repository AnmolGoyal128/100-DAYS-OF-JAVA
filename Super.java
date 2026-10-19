public class Super {
    public static void main(String[] args) {

<<<<<<< HEAD
        // SuperEngineeringStudent es = new SuperEngineeringStudent();
=======
        // EngeneeringStudent es = new EngeneeringStudent();
>>>>>>> origin/main
        // es.age = 23;
        // es.college = "IIT G";
        // es.name = "abnhdu";
        // es.rollNum = 12345678;
        // es.print();
        
<<<<<<< HEAD
        SuperEngineeringStudent es2 = new SuperEngineeringStudent("anhyt",57,453638,"IIT G");
        es2.print();
    }
}
class SuperStudent{
=======
        EngeneeringStudent es2 = new EngeneeringStudent("anhyt",57,453638,"IIT G");
        es2.print();
    }
}
class student{
>>>>>>> origin/main
    String name;
    int age;
    int rollNum;
    int X;

<<<<<<< HEAD
    SuperStudent(){
=======
    student(){
>>>>>>> origin/main

    }


<<<<<<< HEAD
    SuperStudent(String name,int age,int rollNum) {
=======
    student(String name,int age,int rollNum) {
>>>>>>> origin/main
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    void print(){
        System.out.println(name+","+age+","+rollNum);

    }
}
<<<<<<< HEAD
class SuperEngineeringStudent extends SuperStudent{
    String college;

    SuperEngineeringStudent(String name,int age,int rollNum,String college){
=======
class EngeneeringStudent extends student{
    String college;

    EngeneeringStudent(String name,int age,int rollNum,String college){
>>>>>>> origin/main
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
