class MyHashSet {
    ArrayList<Integer>[] bucket =
        new ArrayList[1000]; // remeber this we creating an array of arraylist
    int index = 0;
    public MyHashSet() {}

    public void add(int key) {
        index = key % 1000; // hash function u know it
        if (bucket[index] == null) { // if bucket doesnt exist there then initialise it
            bucket[index] = new ArrayList<>(); // iniitally value is null if bucket doesnt
                                               //  exist so we initialise it manually

            bucket[index].add(key); // adding a key at an bucket of index
        } else {
            if (!bucket[index].contains(key)) { // duplicate not allowed so if bucket 
                                                //doesnt contain then only add
                bucket[index].add(key);
            }
        }
    }

    public void remove(int key) {
        index = key % 1000;
        if (bucket[index] != null
            && bucket[index].contains(
                key)) { // incase bucket doesnt exist there it will give null error
            bucket[index].remove(Integer.valueOf(key)); // remove fxn uses index but 
                                        //with integer.valaueof we can remove using key
        }
    }

    public boolean contains(int key) {
        index = key % 1000;
        if (bucket[index] != null && bucket[index].contains(key)) {
            return true;
        } else {
            return false;
        }
    }
}
