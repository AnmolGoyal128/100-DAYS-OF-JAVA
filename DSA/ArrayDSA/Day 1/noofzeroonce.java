//package ArrayDSA;

public class noofzeroonce {
    public static int[] noofzeroonce(int[] arr){
        int zerocount =0;
        int oncecount =0;
        for(int index =0;index<arr.length;index++){
            if(arr[index]==0){
                zerocount++;

            }
            else{
                oncecount++;
            }
        }
        int ansr[] = {zerocount,oncecount};
        return ansr;
    
}

public static void main(String[] args) {
    int arr[] = {0,1,0,1,1,0,1};
    int ans[] = noofzeroonce(arr);
    System.out.println("Number of zeros is :" + ans[0]);
    System.out.println("Number of ones is :" + ans[1]);
}
}
