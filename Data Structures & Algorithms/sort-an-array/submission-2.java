class Solution {
    static int partition(int nums[], int low, int high) {
            int n = nums.length;
            int pivot = nums[low];
            int start = low+1;
            int end = high;

            while (start <= end) {
                while (start <= high && nums[start] <= pivot) {
                    start++;
                }
                while (end >= low && nums[end] > pivot) {
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


        public static void quickSort(int nums[],int low,int high){
            if(low<high){
            int partition = partition(nums,low,high);
            quickSort(nums,low,partition-1);
            quickSort(nums,partition+1,high);
            
            }
        }



    public int[] sortArray(int[] nums) {
         quickSort(nums,0,nums.length-1);
    return nums;
    }
}