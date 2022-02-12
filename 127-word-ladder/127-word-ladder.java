class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> hs = new HashSet<>(wordList);
        if(!hs.contains(endWord))
            return 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        Set<String> vis = new HashSet<>();
        vis.add(beginWord);
        int cnt = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++) {
                String word = q.poll();
                if(word.equals(endWord))
                    return cnt;
                
                for(int j=0; j<word.length(); j++) {
                    for(int k='a'; k<='z'; k++) {
                        char[] arr = word.toCharArray();
                        arr[j] = (char)k; // changing each letter0
                        String str = new String(arr);
                        if(hs.contains(str) && !vis.contains(str)) {
                            q.add(str);
                            vis.add(str);
                        }
                    }
                }
            }
            ++cnt;
        }
        return 0;
    }
}