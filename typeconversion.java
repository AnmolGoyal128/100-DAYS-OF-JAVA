public class typeconversion {
    public static void main(String[] args) {
        int i = 100;
        long l = i; // Implicit type conversion (widening)
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);

        double d = 3.14;
        float f = (float) d; // Explicit type conversion (narrowing)
        System.out.println("Double value: " + d);
        System.out.println("Float value: " + f);

        char c = 'A';
        int asciiValue = c; // Implicit type conversion (widening)
        System.out.println("Character: " + c);
        System.out.println("ASCII value: " + asciiValue);

    //Implicit type conversion (widening) from byte to int
        byte b = 10;
        int num = b;
        System.out.println("Integer value: " + num);
        System.out.println("Byte value: " + b);

    //character to integer conversion
        char ch = 'B';
        int ascii = ch; // Implicit type conversion (widening)
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);

    // Explicit type conversion (narrowing) from double to int
       int j =300;
       byte by = (byte) j; // Explicit type conversion (narrowing)
       System.out.println("Integer value: " + j);
       System.out.println("Byte value: " + by); // 300 % 256 = 44

    //truncation example
        double pi = 3.14159;
        int k;
        k = (int) pi; // Explicit type conversion (narrowing)
        System.out.println("Double value: " + pi);
        System.out.println("Integer value after truncation: " + k); 

    //boolean to any other type conversion is not allowed in Java
        boolean bool = true;
    //int boolToInt = (int) bool; // This will cause a compile-time error
        System.out.println("Boolean value: " + bool);

        byte num1 = -67;
        num1 = (byte) (num1 * 2); // Explicit type conversion (narrowing) after multiplication  
        System.out.println("Byte value after multiplication: " + num1);





        //Type promotion in expressions
        byte x = 10;
        int y = 20;
        float z = 5.5f;
        double m = 0.12345;
        char e = 'C';
        short n = 15;

        double result = (x + y) * (z - m) / (n + e); // Type promotion occurs here

        // (x + y) // promoted to int
        // (z - m) // promoted to double
        // (n + e) // promoted to int
        // int + double / int results in double
        System.out.println((x + y) + " (promoted to int)");
        System.out.println((z - m) + " (promoted to double)");
        System.out.println((n + e) + " (promoted to int)");
        System.out.println((x + y) + " * " + (z - m) + " / " + (n + e) + " (final result is double)");
        System.out.println("Result of the expression: " + result);


        



    }
}

