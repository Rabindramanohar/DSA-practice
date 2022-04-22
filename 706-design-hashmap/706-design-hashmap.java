class MyHashMap {

    List<int[]>[] list;
    int size = 13000;
    
    public MyHashMap() {
        list = new ArrayList[size];
        for(int i=0; i<list.length; i++)
            list[i] = new ArrayList<>();
    }
    
    public int getHashCode(int key) {
        return key%size;
    }
    
    public void put(int key, int value) {
        int idx = getHashCode(key);
        for(int i=0; i<list[idx].size(); i++) {
            if(list[idx].get(i)[0] == key) {
                list[idx].get(i)[1] = value;
                return;
            }
        }
        list[idx].add(new int[]{key, value});
    }
    
    public int get(int key) {
        int idx = getHashCode(key);
        for(int i=0; i<list[idx].size(); i++) {
            if(list[idx].get(i)[0] == key)
                return list[idx].get(i)[1];
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = getHashCode(key);
        for(int i=0; i<list[idx].size(); i++) {
            if(list[idx].get(i)[0] == key)
                list[idx].remove(i);
        }
        return;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */