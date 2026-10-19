public class staticNested {
    public static void main(String[] args) {

        StaticNestedOuter.Inner inner = new StaticNestedOuter.Inner();

        inner.display();
    }
}
// Static nested class
class StaticNestedOuter{

    static int x;

    static class Inner{

        void display(){
            System.out.println("This is a static nested class");
        }


    }

}