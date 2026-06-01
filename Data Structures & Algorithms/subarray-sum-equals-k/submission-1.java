class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
    
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==k){
                count++;
            }
            int a = i;
            int target =0;
            int j =0;
            while (i != nums.length) {
                target = nums[i]+target;
                if(i!=a){
                if(target==k){
                    j++;
                }
                }
                i++;
            }
                count=count+j;
            
            i = a;
        }

        return count;
    }
}