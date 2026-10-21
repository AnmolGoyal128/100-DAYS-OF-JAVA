
public class input {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.err.println("This is an error message.");

        int age = -5; // Example age value
        if(age <0){
            System.err.println("Age cannot be negative.");
        }
    }
}

// System.class ---> PrintStream.out 
// PrintStream ---> println() ---> print() + ln()

// err --> error
// out --> output
