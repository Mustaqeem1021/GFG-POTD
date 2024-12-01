class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Create a HashMap to store the frequency of each character.
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count the frequency of each character in the string.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character.
        for (int i = 0; i < s.length(); i++) {
            if (charCountMap.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        
        // Return '$' if no non-repeating character is found.
        return '$';
    }
}
