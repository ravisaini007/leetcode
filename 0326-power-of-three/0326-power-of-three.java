class Solution {
    public boolean isPowerOfThree(int n) {
        // while(n>1){
        //     if( n%3!=0){
        //         return false;
        //     }
        //     else

        // }
         int base = 3;
        for(int i = 0 ;Math.pow(base,i)<=n;i++){
          if(Math.pow(base,i)==n){
            return true;
          }
        }
        return false;
    }
}