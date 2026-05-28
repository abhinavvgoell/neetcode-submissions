// MERGESORT USING NORMAL ARRAY BEST OPTIMAL 
class Solution {
    private static int temp[];
    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int index = low;

        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[index]=nums[i];
                i++;
                index++;
            } else {
               temp[index]=nums[j];
               index++;
                j++;
                
            }
        }

        while (i <= mid) {
            temp[index]=nums[i];
            index++;
            i++;
        }
        while (j <= high) {
            temp[index]=nums[j];
               index++;
            j++;
        }

        for (i = low; i <= high; i++) {
            nums[i] = temp[i];
        }
    }

    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}