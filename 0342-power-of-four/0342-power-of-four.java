class Solution {
    public boolean isPowerOfFour(int n) {
        // for(int i =0;i*i<n;i++){
        //     if(n==Math.pow(4,i)){
        //         return true;
        //     }
        // }  
        // return false;
        while(n>0){
            if(n==1){
                return true;
            }
            if(n%4!=0){
            break;
            }
            n=n/4;
        }
        return false;
    }
}