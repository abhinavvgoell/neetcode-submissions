class Solution {
    public String encode(List<String> strs) {
        String encoded_string = "";
        int n = strs.size();
        for (int i = 0; i < n; i++) {
            String temp = strs.get(i);
            int l = temp.length();
            temp = l + "#" + temp;
            encoded_string = encoded_string + temp;
        }
        return encoded_string;
    }
    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int n = str.length();
        int i = 0;
        int m = 0;
        char str2 = '#';
        while (i <n) {
            m = str.charAt(i) - '0';
            int a=1;
            while(str.charAt(i + a) != '#') {
                int k = str.charAt(i + a) - '0';
                m = m * 10 + k;
                a++;
            }
            i = i + 2+a-1;
            String temp = "";
            temp = str.substring(i, i + m);
            i = i + m;
            list.add(temp);
        }
        return list;
    }
}
