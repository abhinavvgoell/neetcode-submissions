class Solution {

    static int partition(int nums[], int low, int high) {

        int pivot = nums[low];

        int start = low;
        int end = high;

        while (start < end) {

            while (start <= high - 1 && nums[start] <= pivot) {
                start++;
            }

            while (end >= low + 1 && nums[end] > pivot) {
                end--;
            }

            if (start < end) {

                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }

        int temp = nums[end];
        nums[end] = nums[low];
        nums[low] = temp;

        return end;
    }

    public static void quickSort(int nums[], int low, int high) {

        if (low < high) {

            int pIndex = partition(nums, low, high);

            quickSort(nums, low, pIndex - 1);

            quickSort(nums, pIndex + 1, high);
        }
    }

    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length - 1);

        return nums;
    }
}