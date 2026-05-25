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
class Student{   //parent -A
    String name;
    int age;

    public void markAttendence(){    
        System.out.println("Attendence marked");
    }
}
class EngenneringStudent extends Student{ //child -B
    void attendllab(){
        System.out.println("Lab Attended");
    }
}

//  class  CSEEngenneringStudent extends EngeneeringStudent{
//     void attendlab(){
//         System.out.println("CSE lab attended");
//     }
// }

class MedicalStudent extends Student{  //Child -C
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