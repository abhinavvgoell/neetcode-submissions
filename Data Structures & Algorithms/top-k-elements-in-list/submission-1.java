class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxV=0;
        int maxK=0;
        int n = nums.length;
        int[] finall = new int[k];
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
            }
            else{
                int freq= map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        int i=0;
        while(i<k){
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int v= entry.getValue();
            if(maxV<v){
                maxV=v;
                maxK = key;
            }
        }
        finall[i]=maxK;
        map.put(maxK,0);
        maxV=0;
        i++;
        }

        return finall;
    }
}
