class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++)
       {
        int r=target-nums[i];
        if(map.containsKey(r))
        {
            return new int[]{i,map.get(r)};
        }
        else
        {
            map.put(nums[i],i);
        }
       }
       throw new IllegalArgumentException("No two sum solution found");
    
    }
}