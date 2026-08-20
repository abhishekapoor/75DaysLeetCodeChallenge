class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int seat[] : reservedSeats){
            map.computeIfAbsent(seat[0], k -> new ArrayList<>()).add(seat[1]);
        }

        int ans = 2 * (n - map.size());
        
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();

            boolean left = true;
            boolean middle = true;
            boolean right = true;

            for (int seat : list) {
                if (seat >= 2 && seat <= 5)
                    left = false;

                if (seat >= 4 && seat <= 7)
                    middle = false;

                if (seat >= 6 && seat <= 9)
                    right = false;
            }

            if (left && right) {
                ans += 2;
            } else if (left || middle || right) {
                ans += 1;
            }
        }

        return ans;
    }
}