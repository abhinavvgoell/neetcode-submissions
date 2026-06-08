class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            int j =i+1;
            while(j-i<=k && j<n){
                if(nums[i]==nums[j]){
                return true;
                }
                j++;
            }
        }
        return false;
    }
}