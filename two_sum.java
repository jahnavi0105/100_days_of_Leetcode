//brute force method

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}

// two pointers

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int []arr=new int[2];
        int[]copy=Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        while(l<r){
            if(copy[l]+copy[r]==target)
            {
              break;
            }
            else if(copy[l]+copy[r]>target)
                r--;
            else
                l++;
            }
         for(int i=0;i<nums.length;i++){
              if(nums[i]==copy[l])
                  arr[0]=i;
         }
          for(int i=nums.length-1;i>=0;i--){
              if(nums[i]==copy[r])
                  arr[1]=i;
         }
        return arr;
        
            }
        
    }
    
    //hashmaps
    
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[]arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(map.containsKey(a) && i!=map.get(a)){
                arr[0]=i;
                arr[1]=map.get(a);
            }
        }
        return arr;
    }
}
