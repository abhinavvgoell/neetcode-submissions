// -4 -1 -1  0  1  2
//  0  1  2  3  4  5
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> store = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (j < k) {
                List<Integer> list = new ArrayList<>();
                int goal = nums[i] + nums[j] + nums[k];
                if (goal == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    store.add(list);
                    j++;
                    k--;
                

                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
                while (j<k && nums[k] == nums[k + 1]) {
                    k--;
                }
                }

                else if (goal < 0) {
                    j++;
                }
                else {
                    k--;
                }
                
            }
        }
        return store;
    }
    
}

