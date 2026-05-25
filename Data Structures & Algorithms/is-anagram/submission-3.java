class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map= new HashMap<>();
        int n1= s.length();
        int n2= t.length();
        if(n1!=n2){
            return false;
        }
        for(int i=0;i<n1;i++){
            if(map.containsKey(s.charAt(i))){
                int j= map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i),j);
            }
            else{
                map.put(s.charAt(i),1);
            }

            if(map.containsKey(t.charAt(i))){
                int j= map.get(t.charAt(i)) - 1;
                map.put(t.charAt(i),j);
            }
             else{
                map.put(t.charAt(i),-1);
            }
            
        }

       for(Character c: map.keySet()){
        if(map.get(c)!=0){
            return false;
        }
       }
        
        return true;

    }
}
