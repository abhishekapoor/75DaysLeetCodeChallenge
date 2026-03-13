class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : h.entrySet()){
            if(entry.getValue()>=2) return true;
        }

        return false;
    }
}