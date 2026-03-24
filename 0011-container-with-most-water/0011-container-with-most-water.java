class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int ans = 0;
        while(l<r){
            int a = Math.min(height[l], height[r]);
            int b = r-l;

            ans = Math.max((a*b), ans);

            if(height[l]>height[r]) r--;
            else l++;
        }

        return ans;
    }
}