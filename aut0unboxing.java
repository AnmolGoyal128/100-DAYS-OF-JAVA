public class aut0unboxing {
    public static void main(String[] args) {
       //autoboxing
         int a=10;  //primitive data type
            Integer i=a;  //autoboxing  //converting primitive to wrapper class object
            System.out.println(a+" "+i.intValue());//unboxing -->optional i.intvalue()
             System.out.println(a+" "+i);
            //unboxing

            Integer j = 12;


           // Integer j= new Integer(20); optional -->depricated
            
         
            //Integer j = Integer.valueOf(20);  //autoboxing
            int b=j;  //unboxing  //converting wrapper class object to primitive
            System.out.println(b+" "+j);


            Integer x = 34;
            printInteger(x);

            int z = 39;
            printInteger(z);

            Integer r = 78;
            Integer t = 89;

            int sum = r + t;
            // int sum = r.intValue() + t.intValue();   -->behind the ssen
            System.out.println(sum);

            Integer u = null;
            int o = u;    //int dont know null it only knoes 0
            //gives a null point exception in run time
           //int o = u.intValue();
    }

    static void printInteger(int x){
        System.out.println(x);
    }
    static void printInteger(Integer z){
        System.out.println(z);
    }
}


//1 .Assignments
//2. Method Calls
//3. Arithmatic operations
