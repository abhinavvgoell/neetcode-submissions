class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int[] nums = people;
        int i=0;
        int n = nums.length;
        int j =n-1;
        int count = 0;
        int remaining =0;

        
//1 2 3 4                // 1 2 2 3 3 
       while(i<=j) {                     
      remaining = limit- nums[j];
      j--;
    
      count++;
      if(i<=j && remaining>=nums[i] ){
        i++;
      }
       }
       return count;
    }
}