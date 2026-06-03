class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int[] nums = numbers;
        int j = nums.length - 1;
        int n = nums.length;
        int arr[] = new int[2];
        while(nums[i]+nums[j]>target){
            j--;
        }
        int k =j;
        while(j<=k){
            if(nums[i]+nums[j]<target){
                i++;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                 arr[0] = i + 1;
                arr[1] = j + 1;
                break;
            }
        }        
        return arr;
    }
}
