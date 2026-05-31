class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        int m =1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            int j =i+1;
            if(nums[j]-nums[i]==1){
                k++;
                if(k>m){
                m=k;
                }
            }
            else if (nums[j]-nums[i]==0){
                
                if(k>m){
                m=k;
                }
                continue;
            }
            else{
                if(k>m){
                m=k;
                }
                k=1;
            }
        }
        return m;
    }
}
// 2 3 4 4 5 10 20 
// 0 1 1 2 3 4 5 6 
//2 3 4 5 7 8 9 10 11 12 13 67 68 69 