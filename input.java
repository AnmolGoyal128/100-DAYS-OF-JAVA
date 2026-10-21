import java.io.IOException;
import java.math.BigDecimal;
import java.io.*;
import java.util.*;
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


        InputStreamReader isr = new InputStreamReader(System.in); // Stream of bytes to stream of characters
        BufferedReader br = new BufferedReader(isr); // Creating a BufferedReader to read input from the console

        String name = br.readLine(); // Reading a line of text from the console
        System.out.println("You entered: " + name);
        


        Scanner sc = new Scanner(System.in); // Creating a Scanner to read input from the console

        String name2 = sc.nextLine(); // Reading a line of text from the console
        String name3 = sc.next(); // Reading a single word from the console
        int age2 = sc.nextInt(); // Reading an integer from the console
        boolean isTrue = sc.nextBoolean(); // Reading a boolean value from the console
        double salary = sc.nextDouble(); // Reading a double value from the console
        BigDecimal bigDecimalValue = sc.nextBigDecimal(); // Reading a BigDecimal value from the console
        System.out.println("You entered: " + name2);

    }
}


// System.class ---> PrintStream.out 
// PrintStream ---> println() ---> print() + ln()

// err --> error
// out --> output

// A --> 65 --> BInary representation of 65 is 01000001

/*
1. Anmol
2. OS buffer ()
3. System.in (Input Stream) recieves bytes 
4. InputStreamReader (Converts bytes to characters)
["A", "n", "m", "o", "l", "\n"] --> 65, 110, 109, 111, 108, 10
5. BufferedReader (Provides efficient reading of text data) --> readline --> Aditya --> name = "Aditya"

*/