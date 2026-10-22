public class immutable2 {
    public static void main(String[] args) {

        Collage c = new Collage("IITB", "Bombay");

        Student s1 = new Student(23, "Rahul", c);
        
        System.out.println(s1.getCollage().name);   
        
        s1.getCollage().name = "IITG";
        System.out.println(s1.getCollage().name);
    }
    
}

// Immutable
// deffencive copy of collage (non primitive)
final class Student{
    private final int age;
    private final String name;
    private final Collage collage;

    Student(int age, String name, Collage collage){
        this.age = age;
        this.name = name;
        this.collage = new Collage(collage.name, collage.address);
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public Collage getCollage(){
        return new Collage(this.collage.name, this.collage.address);
    }
}

// Muttable

class Collage{
    String name;
    String address;

    Collage(String name, String address){
        this.name = name;
        this.address = address;
    }

}
