class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
        
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
            
         
            if (i >= 2 && s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2)) {
                charCount.put(currentChar, charCount.get(currentChar) - 1);
            } else {
                sb.append(currentChar);
            }
        }
        
        return sb.toString();
    }
    }