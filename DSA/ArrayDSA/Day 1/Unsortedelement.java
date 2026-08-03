//package ArrayDSA;

public class Unsortedelement {
     static int Unsorted(int lrr[]){
        for(int i =0;i<lrr.length;i++){
            if (lrr[i+1]<=lrr[i]){
                return lrr[i+1];

            
            }
        }
        //jis case me array se bahar aa jaunga
        return -1;

     }

     public static void main(String[] args) {
        int lrr[] = {1,2,5,4,9};
        System.out.println(Unsorted(lrr));
     }



     }

