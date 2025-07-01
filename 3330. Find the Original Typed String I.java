class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        int cnt = 1;
        char ch = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                cnt++;
            } else {
                ans += (cnt - 1);
                ch = word.charAt(i);
                cnt = 1;
            }
        }

        ans += (cnt - 1);
        return ans;
    }
}