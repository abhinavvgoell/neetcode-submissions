//USING BOYER MOORE 0(1) SPACE AND LINEAR TIME COMPLEXITY 2N IG OPTIMAL SOLUTION 
//enhanced version of solution 2 as leetcode as 95 cases but here only 25 so more edge cases 
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int curr1 = 0;
        int curr2 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;
        int freq1 = 0;
        int freq2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr1)
                count1++;

            else if (nums[i] == curr2)
                count2++;

            else if (count1 == 0) {
                curr1 = nums[i];
                count1 = 1;
            }

            else if (count2 == 0) {
                curr2 = nums[i];
                count2 = 1;
            }

            else {
                count1--;
                count2--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == curr1) {
                freq1++;
            }
            if (nums[i] == curr2) {
                freq2++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (curr1 == curr2) {
            list.add(curr1);
            return list;
        }
        if (freq1 > n / 3) {
            list.add(curr1);
        }
        if (freq2 > n / 3) {
            list.add(curr2);
        }
        return list;
    }
}