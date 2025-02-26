class Solution {
    public int addDigits(int num) {
        int sum=0;
        int out = num;
        int length = (int) (Math.log10(out) + 1);
        for( int i = 1 ; i<=length;i++){
            if(length==1){
                return out;
                 
            }
             else{out = checksum(out);}   

            }
        return out;
    }
    static int checksum(int n){
        int sum =0;
         while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }
}

