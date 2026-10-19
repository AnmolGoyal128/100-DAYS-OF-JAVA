public class maximum {

    
    public static int grtMaximum(int arr[]){
        int maxi = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxi){
                 maxi = arr[i];
            }

        }
        return maxi;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,8};
        System.out.println(grtMaximum(arr));
    }
    
    
}
