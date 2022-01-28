class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];  //x^x==0
                              //x^0=x
        }
        return res;
    }
}
