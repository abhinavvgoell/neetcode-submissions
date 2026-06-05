class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> store = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        int l = n - 1;
        for (i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (l = n-1; l >= 0; l--) {
                if (l < n - 1 && nums[l] == nums[l + 1]) {
                    continue;
                }
                long curr = nums[i] + nums[l];
                long goal = target - curr;
                int j = i + 1;
                int k = l - 1;
                while (j < k) {
                    List<Integer> list = new ArrayList<>();
                    if (goal == nums[j] + nums[k]) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        store.add(list);
                        j++;
                        k--;

                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    } else if (goal > nums[j] + nums[k]) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return store;
    }
}