class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        int count =  0;
        int l = 0;
        int r = 0;
        if (s.length()==1) return 1;
        int len =0;
        while(r<s.length()){
            if(hash[s.charAt(r)]==1){
                Arrays.fill(hash,0);
                l++;
                r = l;
            }
            count = Math.max(count,r-l+1);
            hash[s.charAt(r)] = 1;
            r++;
        }
        return count;
    }
}