class Solution {
    public int majorityElement(int[] nums) {
        // using hashmap to store the count 
        int n = nums.length;
        int v= 0;
        int k =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                freq++;
                map.put(nums[i],freq);
            }
            else{
            map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(v<=entry.getValue()){
             k = entry.getKey();
             v= entry.getValue();
        }

        }

        return k;

    }
}