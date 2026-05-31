class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n =nums.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               int freq = map.get(nums[i]);
               map.put(nums[i],freq+1);
            }
            else{
            map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                list.add(entry.getKey());
            }
        }
        return list;

    }
}