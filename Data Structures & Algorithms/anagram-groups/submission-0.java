class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;

        for(int i=0;i<n;i++){
            String s = strs[i];
            char arr[]= s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(map.containsKey(sorted)){
                List<String> list = map.get(sorted);
                list.add(s);
                map.put(sorted,list);
            }
            else{
                List<String> list1 = new ArrayList<>();
                list1.add(s);
                map.put(sorted,list1);
            }
        }

        List<List<String>> fList = new ArrayList<>(map.values()); //remember this wrapping
        return fList;

        

    }
}
