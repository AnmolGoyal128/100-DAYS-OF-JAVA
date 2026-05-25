public class Super {
    public static void main(String[] args) {
        
    }
}
class student{
    string name;
    int age;
    int rollNum;
    int X;
}
class EngeneeringStudent extends student{
    string college;

    void print(){
        System.out.println(super.name+","+super.age+","+super.rollNum+","+ super.X);
    }

}
