class MyHashMap {
    LinkedList<Node>[] bucket = new LinkedList[10];
    int index;
    class Node{
        int key1;
        int value1;
    }

    public MyHashMap() {
    
    }
    
    public void put(int key, int value) {
        index = key % 10;
        if(bucket[index]==null){
            bucket[index] = new LinkedList<>();
        }
        int sign = 0;
        for(Node node : bucket[index]){
            if(key==node.key1){
                node.value1= value;
                sign = 1;
                break;
            }
        }
        if(sign == 0){
            Node node = new Node();
            node.key1= key;
            node.value1= value;

            bucket[index].addLast(node);
        }
    }
    
    public int get(int key) {
        index = key % 10;
        if(bucket[index]!=null){
        for(Node node : bucket[index]){
            if(key==node.key1){
                return node.value1;
            }
        }
        }
                return -1;
    }

    public void remove(int key) {
         index = key % 10;
        if(bucket[index]!=null){
        for(Node node : bucket[index]){
            if(key==node.key1){
                bucket[index].remove(node);
            }
        }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */