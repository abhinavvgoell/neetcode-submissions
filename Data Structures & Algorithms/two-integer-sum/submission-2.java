class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int c=0;
        int find=0;
        int d=0;
       
        for(int i=0;i<n;i++){
            find= target - nums[i];
            if(map.containsKey(find)){
                c= map.get(find);
                d= i;
                break;
                
            }
            else{
            map.put(nums[i],i);
            }
        }
       int[] arr= {c,d};
        return arr;
    }
}
