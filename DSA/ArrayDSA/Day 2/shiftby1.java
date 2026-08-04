//package ArrayDSA;

public class shiftby1 {
    //right shift by 1
    //10,20,30,40,50,60,70 -->input
    //70,10,20,30,40,50,60 -->output

    static void shift(int [] arr){

        /*
        step1 store value of last index in temp
        step 2 shift all elements to the right by 1 position
        step 3 place the value of temp at the first index
         */
        int n = arr.length;
        int temp = arr[n -1];
        for(int i=n-1;i>0;i--){
        arr[i] = arr[i-1];
    }
    arr[0] = temp;

    

    for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        shift(arr);
        
        
    }
}
