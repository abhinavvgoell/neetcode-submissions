class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int max = 0;
        int j = 0;
        if (s.length() == 1) {
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                count++;
            } else {
                while (s.charAt(j) != c) {
                    set.remove(s.charAt(j));
                    j++;
                    count--;
                }
                j++;
            }
            if (max < count) {
                max = count;
            }
           
        }

        return max;
    }
}
