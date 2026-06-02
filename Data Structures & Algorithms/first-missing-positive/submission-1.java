class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int i = 0;
        int c = 0;
        while (i < n) {
            if (nums[i] - 1 != i) {
                if (nums[i] > 0 && nums[i] <= n) {
                    
                    int j = nums[i] - 1;
                    if(nums[i]!=nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    }
                    else{
                        i++;
                    }
                }
                else{
                    i++;
                }


            } else {
                c = 0;
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] - 1 == i) {
                continue;
            } else {
                ans = i + 1;

                return ans;
            }
        }
        return n + 1;
    }
}