class MyHashSet {
     ArrayList<Integer>[] bucket = new ArrayList[1000];
     int index= 0;
    public MyHashSet() {
       
    }
    
    public void add(int key) {
        index = key % 1000;
        if(bucket[index]==null){
        bucket[index] = new ArrayList<>();
        bucket[index].add(key);
        }
        else{
            if(!bucket[index].contains(key)){
            bucket[index].add(key);
            }
        }
        
    }
    
    public void remove(int key) {
        index = key%1000;
         if(bucket[index] != null && bucket[index].contains(key)){
            bucket[index].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        index = key%1000;
         if(bucket[index] != null && bucket[index].contains(key)){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */