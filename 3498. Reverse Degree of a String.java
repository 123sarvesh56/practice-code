class Solution {
    public int reverseDegree(String s) {
       int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int revindex = ('z' - c) + 1;  //'z' takes ascii value --> 'z'=122, c='a'=96 --> a=(122-96)+1=26
            sum += ((i+1) * revindex);    
            // int index = i + 1;
            // sum +=(index*p);
        }
        return sum; 
    }
}