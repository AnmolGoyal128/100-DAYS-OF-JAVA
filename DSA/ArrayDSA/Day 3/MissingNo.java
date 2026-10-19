public class MissingNo {
    public int missingNumber(int[] nums){
        int XORsum = 0;;
        // xor with al  the array element
        for(int i = 0;i<nums.length;i++){
            XORsum = XORsum ^ i;
        }

        // xor with array element in the range
        int n = nums.length;
        for( int j = 0; j<= n ;j++){
            XORsum = XORsum ^ j;
        }
        return XORsum;
    }
}
