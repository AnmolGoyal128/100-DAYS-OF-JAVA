public class demo4 {
    public static void main(String[] args) {
        //to give input string argument is used

        System.out.println("Number of argument are"+args.length);

        for(int i = 0;i<args.length;i++){
            System.out.println("argument"+i+"="+ args(i));
        }
    }

    //mainly usde in springboot

    // in old days it is ude to give input from useer

    private static String args(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'args'");
    }
}
