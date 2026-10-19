//package ArrayDSA;

public class arrsearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(findTarget(arr,target));
        
    }
    public static boolean findTarget(int arr[],int target){
        for (int i =0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;

    }
}
