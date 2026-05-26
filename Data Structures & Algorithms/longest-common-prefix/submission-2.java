class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String com = "";

        int min = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        if (n > 1) {
            for (int j = 0; j < min; j++) { // string character iteration
                String temp = strs[0];
                char s = temp.charAt(j);
                int i = 1;
                while (i < n) { // array iteration
                    String temp1 = strs[i];

                    if (s == temp1.charAt(j)) {
                        i++;
                    } else {
                        return com;
                    }
                    if (i == n) {
                        com = com + temp1.charAt(j);
                    }
                }
            }
        }
        else if(n == 0) {
            return com;
        }
        else {
            com = strs[0];
            return com;
        }
        return com;
    }
}