import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> set = new HashSet<>(wordList);

        if(!set.contains(endWord)) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            String word = curr.word;
            int level = curr.level;

            if(word.equals(endWord)) return level;

            char[] arr = word.toCharArray();

            for(int i = 0; i < arr.length; i++){
                char original = arr[i];

                for(char ch = 'a'; ch <= 'z'; ch++){
                    arr[i] = ch;

                    String newWord = new String(arr);

                    if(set.contains(newWord)){
                        q.add(new Pair(newWord, level + 1));
                        set.remove(newWord); // mark visited
                    }
                }

                arr[i] = original; // restore
            }
        }

        return 0;
    }
}

class Pair {
    String word;
    int level;

    Pair(String word, int level){
        this.word = word;
        this.level = level;
    }
}