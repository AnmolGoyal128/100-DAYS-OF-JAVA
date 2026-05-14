public class datatypes {
    public static void main(String[] args) {
        //integer data type
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("Integer values --> "+ num1 +","+ num2 +","+ num3 +","+ num4);
        int firstnum = 2323232;
        System.out.println(firstnum);

        //floating point data type
        float num5 = 3.14f;
        double num6 = 3.14159265358979323846;
        System.out.println(num5);
        System.out.println(num6);
        System.out.println("Floating point values --> "+ num5 +","+ num6);

        //character data type
        char letter = 'A';
        System.out.println(letter);
        //boolean data type
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println("Boolean values --> "+ isJavaFun +","+ isFishTasty);
            
    }
}