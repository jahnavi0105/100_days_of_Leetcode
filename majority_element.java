class Solution {
    public int majorityElement(int[] nums) {
        int c=1,ind=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ind){
                c++;
            }
            else{
                c--;
            }
            if(c==0)
            {
            c=1;
            ind=nums[i];
            }
        }
        int co=0;
        for(int i=0;i<nums.length;i++){
        if(ind==nums[i])
            co++;
        }
        
        if(co>(nums.length)/2)
            return ind;
        return -1;
    }
}
