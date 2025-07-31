class Solution {
    public int lengthOfLastWord(String s) {
        String[] sb=s.trim().split(" ");
        String li=sb[sb.length-1];
        return li.length();
    }
}