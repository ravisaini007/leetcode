class Solution {
    public int climbStairs(int n) {
       int prev1 = 2; 
       int prev2 = 3;
        int cur =0;
       if(n<=3){
        return n;
       }
    
        for(int i=3;i<n;i++){
            cur = prev1 + prev2;
            prev1 = prev2;
            prev2 = cur;
        }
       return cur;
    }
}