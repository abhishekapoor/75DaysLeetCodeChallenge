class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int suf[] = new int[nums.length];

        int product = 1;
        pre[0] = 1;
        for(int i=1; i<nums.length; i++){
            product *= nums[i-1];
            pre[i] = product;
        }

        product = 1;
        suf[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            product *= nums[i+1];
            suf[i] = product;
        }

        for(int i=0; i<nums.length; i++){
            ans[i] = pre[i] * suf[i];
        }

        return ans;
    }
}