class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int n =s.length;
        int j= n-1;
        
        while(i<j){
            if(s[j]!=s[i]){
             char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
            }
            else{
                i++;
                j--;
            }
        }
    }
}