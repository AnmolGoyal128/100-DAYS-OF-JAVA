//package ArrayDSA;
//package Day 1;

public class sumof {
    public static int[] sumof(int[] arr){
        int sum =0;
        int sum1 =0;

        for(int index =0;index<arr.length;index++){
            if(arr[index] <0){
                sum = sum + arr[index];
                
            }
            else{
                sum1 = sum1 + arr[index];
            }
            
        }
        int ansr[] = {sum1,sum};
        
        return ansr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-5,6,-7,8,-9};
        int ans[] = sumof(arr);
        System.out.println("Positive sum is :" + ans[0]);
        System.out.println("Negative sum is :" + ans[1]);
    }
    
}
