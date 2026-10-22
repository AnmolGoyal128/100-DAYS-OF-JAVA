public class immutable {
    public static void main(String[] args) {

        Collage collage = new Collage("IITB", "Bombay");

        Student s1 = new Student(23, "Rahul", collage);
        //s1.setAge(74794);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getCollage());
        
        System.out.println(s1.getCollage().name);   
        
        s1.getCollage().name = "IIT G";
        System.out.println(s1.getCollage().name);
        
    }
    
    
}

// Immutable class (NOT Purely Immutable)

final class Student{
    private final int age;
    private final String name;
    private final Collage collage;

    Student(int age, String name, Collage collage){
        this.age = age;
        this.name = name;
        this.collage = collage;
    }

    // Setters
    // public void setAge(int age){
    //     this.age = age;
    // }

    // public void setName(String name){
    //     this.name = name;
    // }

    // getters
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public Collage getCollage(){
        return this.collage;
    }

}
// Not possible as Student class is final it can not be extended
// class CSEStudent extends Student {

// }

// Mutabble

class Collage{
    String name;
    String address;

    Collage(String name, String address){
        this.name = name;
        this.address = address;
    }

}


