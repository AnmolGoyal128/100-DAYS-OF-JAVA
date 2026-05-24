public class Final {
    public static void main(String[] args) {
        random r1 = new random();
        System.out.println(r1.PI);

        final int x = 4;
        //x = 4;
        System.out.println(x);


        //why main is static in java??
        //final f1 = new final()
        //f1.main()
        //final.main()

    }
    //this is the reason why we call static in main because we call it in main
}
class random{
    // final double PI = 3.14;     /*it is allowd that we can initialized final in class
    //                               and define it in constructor  */

    static final double PI;
    // final double PI;

    // random(){
    //     this.PI = 3.14;

    // }

    static{
        PI = 3.14;
    }
}
