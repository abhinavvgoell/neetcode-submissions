class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int curr1 = 0;
        int curr2 = 0;
        int count1 = 0;
        int count2 = 0;
        int n =nums.length;
        int freq1=0;
        int freq2=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr1) {
                count1++;
            } else if (nums[i] == curr2) {
                count2++;
            } else if (count1 == 0) {
                curr1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                curr2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        for(int i =0;i<n;i++){
            if(nums[i]==curr1){
                freq1++;
            }
            if(nums[i]==curr2){
                freq2++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(freq1>n/3){
        list.add(curr1);
        }
        if(freq2>n/3){
        list.add(curr2);
        }
        return list;
    }
}