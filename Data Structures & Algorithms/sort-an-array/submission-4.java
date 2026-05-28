// MERGESORT
class Solution {
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
        ArrayList<Integer> list = new ArrayList<>();
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                list.add(nums[i]);
                i++;
            } else {
                list.add(nums[j]);
                j++;
            }
        }

        while (i <= mid) {
            list.add(nums[i]);
            i++;
        }
        while (j <= high) {
            list.add(nums[j]);
            j++;
        }

        for (i = low; i <= high; i++) {
            nums[i] = list.get(i-low);
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}