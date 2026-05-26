class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] arr= new int[2];
          
        for(int i=0;i<n;i++){
            int finall = target - nums[i];
            if(map.containsKey(finall)){
               int c= i;
               int d= map.get(finall);
                arr=new int[]{d,c};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;

    }
}
