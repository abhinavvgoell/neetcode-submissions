class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int current= nums[0];
        //count and current 
        for(int i=0; i <n; i++){
            if(nums[i]==current){
                count ++;
            }
            else{
                count--;

                if(count==0){
                    current= nums[i];
                    count++;
                }
            }
            


        }
        return current;
    }
}