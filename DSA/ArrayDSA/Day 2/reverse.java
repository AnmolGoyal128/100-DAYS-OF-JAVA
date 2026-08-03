

public class reverse {
    //two pointer method

    static void reverse(int arr[]){

        int n = arr.length;
        int i=0;
        int j =n-1;
        
        while (i<=j) {
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            //i ko aage badhana
            i++;
            //j ko peeche badhana
            j--;

            
        }
        //now your array is reversed 
        //print
        //K become the new index of the reversed array and through which iterate over the whole array and then print it
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverse(arr);
        
    }


}
