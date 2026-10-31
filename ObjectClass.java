public class ObjectClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 23;

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.age = 23;

        Student s3 = null;
        System.out.println(s1.equals(s3));

        Integer i = 23;
        System.out.println(s1.equals(i));

        System.out.println(s1.equals(s2));

        System.out.println(s1.toString()); // --> Both will give same ans
        System.out.println(s1); // Both will give same ans
        
    }
}
class Student{
    String name;
    int age;
    @Override 
    public String toString(){
        return (name + "," + age);
    }
    @Override 

    
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if (obj == null){
            return false;
        
        }
        // Check if both class are of same type Student
        // if not Checked --> ClassCastException
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Student s = (Student) obj;

        return (this.name == s.name && this.age == s.age);
    }
}