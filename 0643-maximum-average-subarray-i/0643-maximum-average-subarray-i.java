class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        double avg = Integer.MIN_VALUE;

        while(r<nums.length){
            sum += nums[r];

            if((r-l+1)>k){
                sum -= nums[l];
                l++;
            }

            if((r-l+1)==k){
                avg = Math.max(avg, (double)sum/k);
            }

            r++;
        }

        return avg;
    }
}