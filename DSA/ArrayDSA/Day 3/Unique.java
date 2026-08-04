public class Unique {
    public int finduniqueelement(int[] nums){
    int xorsum = 0;
    for(int n:nums){
        xorsum = xorsum ^ n;
    }
    return xorsum;
}
}