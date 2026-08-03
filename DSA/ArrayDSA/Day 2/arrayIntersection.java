//package ArrayDSA;

public class arrayIntersection {
    static void intersection(int arr[], int brr[]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<brr.length;j++){
                if(arr[i]==brr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int brr[] = {2,3,4,5,6};
        intersection(arr,brr);
    }
}
