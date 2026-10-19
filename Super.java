public class Super {
    public static void main(String[] args) {

        // SuperEngineeringStudent es = new SuperEngineeringStudent();
        // es.age = 23;
        // es.college = "IIT G";
        // es.name = "abnhdu";
        // es.rollNum = 12345678;
        // es.print();
        
        SuperEngineeringStudent es2 = new SuperEngineeringStudent("anhyt",57,453638,"IIT G");
        es2.print();
    }
}
class SuperStudent{
    String name;
    int age;
    int rollNum;
    int X;

    SuperStudent(){

    }


    SuperStudent(String name,int age,int rollNum) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    void print(){
        System.out.println(name+","+age+","+rollNum);

    }
}
class SuperEngineeringStudent extends SuperStudent{
    String college;

    SuperEngineeringStudent(String name,int age,int rollNum,String college){
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
