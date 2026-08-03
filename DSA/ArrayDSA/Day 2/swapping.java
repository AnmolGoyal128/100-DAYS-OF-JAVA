//package ArrayDSA;

public class swapping {
    static void swap(int arr[]){
        for(int i=0;i<arr.length;i+=2){
            if(arr[i+1]<arr.length){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};

         swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }

    }
    
}
