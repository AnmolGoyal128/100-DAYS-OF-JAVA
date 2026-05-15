public class Arithmatic {
    public static void main(String[] args) {
        // Java Operators | Arithmetic + Unary + Logical + Bitwise + Assignment Operators
        // Arithmatic Operators--> +,-,*,%,/,+=,-=,*=,/=,%=,++,--

        int a = 5;
        int b = 100;

        int c = a+b;
        int d = a-b;
        int e = a/b;
        int f = a%d;
        int g = a*b;

        System.out.println(c + " , "+d+" , "+ e +" , " + f +" , " +g);

        int h = a + 2;
        // h = h + 2;// Science this is okay in CSE
             //OR
        h += 2; //h = h+2;

        h -=2; //h = h-2

        h *=2; //h = h*2

        h /=2; //h = h/2

        h %=2; //h = h%2
        System.out.println(h);

        int i = 6;
        i++; // i = i+1 -->i +=1; 
        System.out.println(i);

         int x = 6;
        x--; // x = x+1 -->x +=1; 
        System.out.println(x);

        //pre increment and post incriment / decriment

        int y = 7;
        y++; //postfix incriment
        ++y; //prefix incriment
        // y = 9

        int k = y++; //k = y ; y = y+1
        System.out.println(y + ","+k);
        
         int l = ++y; //y = y+1; l = y; -->l = y + 1

        System.out.println(l +"," +y);

        


        






    }
}
