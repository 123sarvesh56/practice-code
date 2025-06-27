class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()==0 || s.length()<k){
            return 0;
        }
        if(k<=1){
            return s.length();
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int p=0;
        while(p<s.length() && map.get(s.charAt(p))>=k){
            p++;
        }
        if(p>=s.length()-1){
            return p;
        }
        int left=longestSubstring(s.substring(0,p),k);
        int right=p<s.length()?longestSubstring(s.substring(p+1),k):0;
        return Math.max(left,right);
       
        
    }
}