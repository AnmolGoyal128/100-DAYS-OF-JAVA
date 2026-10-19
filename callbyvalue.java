public class callbyvalue {
    public static void main(String[] args) {
        Random r1 = new Random(3, 5);
        //call by reference --> not possiblr in java
        //just a taste in non primitive data types
        System.out.println(r1.x+","+r1.y);

        addTen(r1);

        System.out.println(r1.x+","+r1.y);
        
    }
    static void addTen(Random r){   //parameters may or may not be primitive and not primitive
        r.x = r.x+10;               //return type may or may not be primitive and not primitive
        r.y = r.y+10;               //insted of void Random is also possible
    }                               //return in required in non primitive data type
}
class Random {
    int x;
    int y;

    Random (int x,int y){
        this.x  = x;
        this.y = y;
}
    Random(Random r){  //we can also form a constructor that that take the argument of above object and assosiate itself with it
        this.x = r.x;
        this.y = r.y;

}

}