class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<accounts.length;i++){
            int sumrow=0;
            for(int j =0;j<accounts[i].length;j++){
                sumrow= sumrow + accounts[i][j];

            }
            if(sumrow>ans){
                ans=sumrow;
            }
        }
        return ans;
    }
}