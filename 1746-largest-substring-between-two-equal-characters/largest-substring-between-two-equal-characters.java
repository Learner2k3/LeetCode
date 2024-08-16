import java.util.HashMap;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // Create a HashMap to store the first occurrence of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = -1; // Initialize maxLen to -1 to handle the case where no characters repeat

        // Iterate over the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Get the current character
            
            // Check if this character has been seen before
            if (map.containsKey(ch)) {
                int last = map.get(ch); // Get the index of the previous occurrence
                // Update maxLen with the length between the previous and current occurrence
                maxLen = Math.max(maxLen, i - last - 1);
            } else {
                // Store the index of the first occurrence of this character
                map.put(ch, i);
            }
        }
        return maxLen; // Return the maximum length found
    }
}
