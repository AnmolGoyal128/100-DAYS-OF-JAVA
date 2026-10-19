//package Day 3;

public class sort0sand1s {
    public int[] sortarray(int[] nums){
       
        int n= nums.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(nums[i] == 1 && nums[j] == 0){
                //swap

                int temp = nums[i];

                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] == 0){
                //i ko aage le jao
                i++;
            }
            if(nums[j] == 1){
                //j ko piche le jao
                j--;
            }
        }
        return nums;

    }
    public void main(String[] args) {
        int[] nums = {1,0,1,0,0,0,1,0,1};
        sortarray(nums);

        
    }



}
    

