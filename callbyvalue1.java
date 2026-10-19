public class callbyvalue1 {
    public static void main(String[] args) {
        // Call by Value

        int x = 3;
        int y = 5;

        System.out.println(x+","+y);

        addTen(x, y);

        System.out.println(x+","+y);
    }
    static void addTen(int x,int y){
        x = x+10;
        y = y+10;
    }
}
