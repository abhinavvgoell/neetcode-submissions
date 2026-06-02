class Solution {
    public boolean validPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
            }
            else{
                i++;
                j--;
            }
        }


return true;
    }
    public boolean isPalindrome(String s ,int l , int h){
        s=s.toLowerCase();
        int n = s.length();
        int i = l;
        int j = h;
        while(i<j){

            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a==b){
                i++;
                j--;
            }
            else{
                return false;
            }
            
        }
       
       return true;
    }
}