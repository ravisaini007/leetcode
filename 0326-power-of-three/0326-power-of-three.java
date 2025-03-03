class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n%3!=0){
        //     return false;
        // }
        // while(n%3==0){
        //     n=n/3;
        // }
        // return n==1;
         int base = 3;
        for(int i = 0 ;Math.pow(base,i)<=n;i++){
          if(Math.pow(base,i)==n){
            return true;
          }
        }
       return false;
    }
}