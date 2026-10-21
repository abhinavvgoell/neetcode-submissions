class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 1) {
            if (nums[0] >= target) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int i = 0, j = 0;
            int sum = 0, minsize = 1000;

            while (j < nums.length) {
                if (sum < target) {
                    sum = sum + nums[j];
                    j++;
                }

               while(sum >= target) {
                    if (minsize  > j-i) {
                        minsize = j - i;
                    }

                    sum = sum - nums[i] ;
                    i++;
                }
            }
            if(minsize==1000){
                return 0;
            }

            return minsize;
        }
    }
}