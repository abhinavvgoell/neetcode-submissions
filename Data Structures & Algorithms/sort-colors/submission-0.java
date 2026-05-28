// WE WILL USE QUICK SORT AS IN-PLACE SORTING REQUIRED,MERGE SORT USES ADDITIONAL TEMPORARY ARRAY 
class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    public static int partition(int nums[],int start, int end ){
        int pivot = nums[start];
        int i = start;
        int j = end; 

        while(i<=j){
            while(i<=end && nums[i]<=pivot){
                i++;
            }
            while(j>=start && nums[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[j];
        nums[j]=nums[start];
        nums[start]=temp;
        
        return j;
    }

    public static void quickSort(int[] nums,int start, int end){
        if(start<end){
            int partition = partition(nums,start,end);
            quickSort(nums,start,partition-1);
            quickSort(nums,partition+1,end);
        }
    }
}