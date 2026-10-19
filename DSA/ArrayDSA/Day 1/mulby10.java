//package ArrayDSA;
public class mulby10 {
    public static void main(String[] args) {
        int brr[] = {2,3,4,5,6};
        System.out.println("The array after multiplying by 10 is: " );
        int[] ans = getMulBy10(brr);

        for(int index =0;index<ans.length;index++){
            int i = ans[index];
            System.out.print(i+" ");
        }
        
    }
    static int[] getMulBy10(int[] brr){
        int size = brr.length;
        int[] newArray = new int[size];
        for(int index = 0;index<=size-1;index++){
            int i = brr[index];
            int newi = i*10;
            newArray[index] = newi; 
        }
        return newArray;
    }

    }
    

