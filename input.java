import java.io.IOException;
public class input {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");

        System.err.println("This is an error message.");

        int age = -5; // Example age value
        if(age <0){
            System.err.println("Age cannot be negative.");
        }

        int x = System.in.read(); // Reading input from the console
       // Omly valid input is a single character, so it will read the ASCII value of the character entered. For example, if you enter 'A', it will read 65.
       // takes only integer value of the character entered and returns the ASCII value of that character. For example, if you enter 'A', it will return 65.
        System.out.println("You entered: " + x);
        System.out.println("You entered: " + (char)x); // Converting the ASCII value back to character and printing it

        String s = "";
        int ch = 0;
        while (ch != 10){ // 10 is the ASCII value for newline character
            ch = System.in.read();
            s += (char)ch; // Converting the ASCII value back to character and appending it to the string
            }
        System.out.println("You entered: " + s);
        
    }
}


// System.class ---> PrintStream.out 
// PrintStream ---> println() ---> print() + ln()

// err --> error
// out --> output

// A --> 65 --> BInary representation of 65 is 01000001
