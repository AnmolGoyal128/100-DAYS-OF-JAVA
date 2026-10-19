// import college.Student;   //can't use b0th the imports
//import School.Student;
import college.*;   //Import  all the files in student package now i can make object of any class present in the college package


//import packagename.classname



public class packages {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.print(); cant call on outsite package without public
        // s1.print();

        School.Student s2 = new School.Student();   //thru this method we can use both the packages without importing others
        s2.print();
    }
}
