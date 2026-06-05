class Solution {
    public int area(int height1, int height2, int l1, int l2) {
        int l = Math.min(height1, height2);
        int b = l2 - l1;
        int area = l * b;
        return area;
    }
    public int maxArea(int[] heights) {
        int i = 0;
        int n = heights.length;
        int j = n - 1;
        int maxarea = 0;
        while (i < j) {
            int area = area(heights[i], heights[j], i, j);
            if (area > maxarea) {
                maxarea = area;
            }
            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxarea;
    }
}
