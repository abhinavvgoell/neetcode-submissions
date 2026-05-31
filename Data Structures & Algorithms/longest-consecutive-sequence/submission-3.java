class Solution {
    public int longestConsecutive(int[] nums) {
        int m;
        int k = 0;

        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (!set.contains(a - 1)) {
                m = a;
                int l = 0;
                while (set.contains(m)) {
                    m++;
                    l++;
                }
                if (k < l) {
                    k = l;
                }
            }
        }

        return k;
    }
}
