/*Types of inheritance
Simple Inheritance
Multi level inheritance
Hierarical inheritance
multiple inheritance   (Not supported in java) */


public class inheritance2 {
    public static void main(String[] args) {
        //CSEEngenneringStudent cs1 = new CSEEngenneringStudent();
        //cs1.attendlab();
        
    }
}

//Simple Inheritance 
<<<<<<< HEAD
class InheritanceBaseStudent{   //parent -A
=======
class Student{   //parent -A
>>>>>>> origin/main
    String name;
    int age;

    public void markAttendence(){    
        System.out.println("Attendence marked");
    }
}
<<<<<<< HEAD
class InheritanceEngineeringStudent2 extends InheritanceBaseStudent{ //child -B
=======
class EngenneringStudent extends Student{ //child -B
>>>>>>> origin/main
    void attendllab(){
        System.out.println("Lab Attended");
    }
}

<<<<<<< HEAD
//  class  CSEEngenneringStudent extends InheritanceEngineeringStudent2{
=======
//  class  CSEEngenneringStudent extends EngeneeringStudent{
>>>>>>> origin/main
//     void attendlab(){
//         System.out.println("CSE lab attended");
//     }
// }

<<<<<<< HEAD
class MedicalStudent extends InheritanceBaseStudent{  //Child -C
=======
class MedicalStudent extends Student{  //Child -C
>>>>>>> origin/main
    void attendlab(){
        System.out.println("Chem lab attended");
    }
}

    


//Multi evel inheritance
// A is a parent of B and Bis a parent of C
//C is a child of B and B is a child of A

/*Hierrarchy
      A  -parent
     / \
-   B   C  --Child
*/

/*
Multiple 
    A  B
    \  /
      C


*/