class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0)
            return false;
        
        String[] notes = ransomNote.split("");
        String[] mags = magazine.split("");
        Arrays.sort(notes);
        Arrays.sort(mags);
        int cnt = 0;
        
        for(String str: notes) {
            if(cnt == mags.length)
                return false;
            while(!mags[cnt].equals(str)) {
                if(cnt == mags.length-1)
                    return false;
                if(!mags[cnt].equals(str))
                    cnt++;
            }
            cnt++;
        }
      return true;  
    }
}