// most optimal answer
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int i = 0;
        int j = n - 1;

        while (i < j) { // reverse
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        j = k-1;
        for (i = 0; i < j; i++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            if(j>i+1){j--;}
        }
        j = n - 1;
        for (i = k; i < j; i++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            if(j>i){j--;}
        }
    }
}