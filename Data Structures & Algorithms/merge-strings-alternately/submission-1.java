class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int n;
        int i =0;
        int j=0;
        if(n1>n2){
            n=n2-1;
        }
        else{
            n=n1-1;
        }
        while(i<=n && j<=n){
            s.append(word1.charAt(i));
            s.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<n1){
            s.append(word1.charAt(i));
            i++;
        }
        while(j<n2){
            s.append(word2.charAt(j));
            j++;
        }

        String s1 = s.toString();
        return s1;
    

    }
}