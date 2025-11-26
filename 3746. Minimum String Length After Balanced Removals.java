class Solution {
    public int minLengthAfterRemovals(String s) {
        int count1=0;
        int count2=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count1++;
            }else{
                count2++;
            }
            count=Math.abs(count1-count2);

        }
        return count;
        
    }
}