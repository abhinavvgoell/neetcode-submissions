class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int j =i+1;
        int n = nums.length;
        while(i<n && j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}