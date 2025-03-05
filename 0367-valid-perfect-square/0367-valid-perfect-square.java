class Solution {
    public boolean isPerfectSquare(int num) {
       int s =1;
       int e = num;
       while(s<=e){
        int mid = s + (e-s)/2;
        long sq = (long) mid*mid;
        if(sq==num){
            return true;
        }
        else if(sq<num){
            s = mid+1;
        }
        else{
            e=mid -1;
        }

       }

      return false;
    }  
}