//package ArrayDSA;

public class printAlternate {
    static void printalternate(int mrr []){
        int n = mrr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(i==j){
                System.out.print(mrr[i] + " ");
                return;
            }
            else{
                System.out.print(mrr[i]+ " ");
                i++;
                System.out.print(mrr[j] + " ");
                j--;
                

            }
        }
    }

    public static void main(String[] args) {
        int mrr[] = {1,2,3,4,5,6};
        printalternate(mrr);
    }

}
