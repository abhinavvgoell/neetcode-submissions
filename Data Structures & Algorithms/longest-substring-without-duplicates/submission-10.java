class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int max =0;
        int j =0;
        int count =0;
        if(n>0){
            max=1;
        }
        while(i<n-1 && j<n){  
            while( j<n && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            count = j-i;
            if(max<count){
                max=count;
            }
            if(j<n && set.contains(s.charAt(j))){
                while( i<n-1 && s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i)); 
                    i++;
                }
                j++;
                i++;
               
            }

           

        }
return max;
    }
}
