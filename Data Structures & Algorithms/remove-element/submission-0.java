class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int k=0;
        int l=0;
        while(i<n){
           if(nums[i]==val){
            int temp = nums[n-1];
            nums[i]= nums[n-1];
            nums[n-1]= temp;
            n--;
           }
           else{
            i++;
           }
        }
        return n;
        
    }
}