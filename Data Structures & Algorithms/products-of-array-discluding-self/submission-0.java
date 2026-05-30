class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix= new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=0;i<n-1;i++){
            prefix[i+1]= nums[i]*prefix[i];
        }
         for(int i=n-1;i>0;i--){
            suffix[i-1]= nums[i]*suffix[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=suffix[i]*prefix[i];
        }
        return nums;
    }
}  
