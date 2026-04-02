class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[temperatures.length];

        for (int i=temperatures.length - 1; i>=0; i--){
            int curr = temperatures[i];
            while(!st.isEmpty() && curr>=temperatures[st.peek()]){
                st.pop();
            }

            arr[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return arr;
    }
}