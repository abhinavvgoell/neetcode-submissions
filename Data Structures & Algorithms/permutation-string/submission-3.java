class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            int s = s1.charAt(i) - 97;
            freq1[s]++;
        }
        int j = 0;
        int i = 0;

        while (j<s2.length()) {
            int s = s2.charAt(j) - 97;
            freq2[s]++;

            if (j - i >= s1.length()-1) {
                if (Arrays.equals(freq1, freq2)) {
                    return true;
                }
                freq2[s2.charAt(i)-97]--;
                i++;
            }

            j++;
        }

        return false;
    }
}
