class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        int n1= s.length();
        int n2= t.length();
        for(int i=0;i<n1;i++){
            if(map.containsKey(s.charAt(i))){
                int j= map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i),j);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<n2;i++){
            if(map2.containsKey(t.charAt(i))){
                int j= map2.get(t.charAt(i)) + 1;
                map2.put(t.charAt(i),j);
            }
            else{
                map2.put(t.charAt(i),1);
            }
        }

        if(map.size()==map2.size()){
            for(int i=0;i<n1;i++){
                if(map.get(s.charAt(i)).equals(map2.get(s.charAt(i)))){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;


    }
}
