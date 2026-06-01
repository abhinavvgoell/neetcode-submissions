class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int i =1;
        while(true){
            if(set.contains(i)){
                i++;
                continue;
            }
            else{
                return i;
            }

        }   
    }
}