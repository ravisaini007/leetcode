class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e = nums.length - 1;
        if(target < nums[s])
            return 0;
        if(target > nums[e])
            return e+1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target > nums[mid])
            s = mid+1;
            else if(target < nums[mid])
            e = mid-1;
            else
            return mid;
        }
        return s;
    }
}