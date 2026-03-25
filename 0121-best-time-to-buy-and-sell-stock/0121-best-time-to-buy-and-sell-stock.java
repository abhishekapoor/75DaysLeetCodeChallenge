class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i=0; i<prices.length; i++){
            if (min<prices[i]) {
                int profit = prices[i] - min;
                max = Math.max(max,profit);
            } 
            else {
                min = prices[i];
            }
        }
        return max;
    }
}