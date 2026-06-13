class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            String s = words[i];
            int sum = 0;
            for(char c : s.toCharArray()){
                sum += weights[c-'a'];
            }
            char c = (char) ('a' + Math.abs((sum % 26)-25));
            sb.append(c);
        }
        return sb.toString();
    }
}