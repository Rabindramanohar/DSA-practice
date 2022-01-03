class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            
            List<Integer> tmp = new ArrayList<>();
            if(i==0) {
                tmp.add(1);
                list.add(tmp);
                continue;
            }
             if(i==1) {
                 tmp.add(1);
                 tmp.add(1);
                 list.add(tmp);
                 continue;
            }
            
            tmp.add(1);
            for(int j=0; j<i-1; j++) {
                tmp.add(list.get(i-1).get(j) + list.get(i-1).get(j+1));
            }
            tmp.add(1);
            list.add(tmp);
        }
        
        return list;
    }
}