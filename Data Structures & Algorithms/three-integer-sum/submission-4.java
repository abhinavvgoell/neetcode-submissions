// -4 -1 -1  0  1  2
//  0  1  2  3  4  5
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> store = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            int goal = 0 - curr;

            while (j < k) {
                List<Integer> list = new ArrayList<>();
                if (goal < nums[k] + nums[j]) {
                    k--;
                }
                else if (goal > nums[k] + nums[j]) {
                    j++;
                }
                else {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if (!store.contains(list)) {
                        store.add(list);
                    } else
                        j++;
                }
            }
        }
        return store;
    }
}
