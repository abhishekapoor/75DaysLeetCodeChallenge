import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a1 = s.toCharArray();
        char[] b1 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1, b1);
    }
}
