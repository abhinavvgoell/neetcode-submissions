class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int max = 0;
        HashMap<Integer, Integer> leftmap = new HashMap<>();
        HashMap<Integer, Integer> rightmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (max < height[i]) {
                leftmap.put(i, max);
                max = height[i];

            } else {
                leftmap.put(i, max);
            }
        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (max < height[i]) {
                rightmap.put(i, max);
                max = height[i];
            } else {
                rightmap.put(i, max);
            }
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            if (leftmap.get(i) > height[i] && rightmap.get(i) > height[i]) {
                int store = Math.min(leftmap.get(i), rightmap.get(i));
                store = store - height[i];
                water = water + store;
            }
        }

        return water;
    }
}
