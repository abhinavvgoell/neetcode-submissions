class Solution {
    public void rotate(int[] nums, int k) {

        int i;
        int n = nums.length;
        int[] temp = new int[n];
        int a = 0;
        if (k > n) {
            k = k % n;
        }
        for (i = n - k; i < n; i++) {
            temp[a] = nums[i];
            a++;
        }

        for (i = 0; i < n - k; i++) {
            temp[a] = nums[i];
            a++;
        }

        for (i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        
    }

    
}
