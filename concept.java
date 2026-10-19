public class concept {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        System.out.println(x==y);
        Integer a = 200;
        Integer b = 200;
        System.out.println(a.intValue() == b.intValue());  //true
        System.out.println(a.equals(b));  //true
        System.out.println(a == b);  //false

        Integer p = 200;
        Integer l = 200;
        System.out.println(p == l); //true
        
       
    }
}
 