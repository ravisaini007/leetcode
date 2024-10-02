class Solution {
    public int removeElement(int[] nums, int val) {
       int k = 0;

        //loop through each element in the array

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
}