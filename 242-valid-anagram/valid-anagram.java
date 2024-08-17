import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create a map to count character occurrences
        Map<Character, Integer> map = new HashMap<>();
        
        // Count characters in the first string
        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        // Subtract counts based on the second string
        for (char b : t.toCharArray()) {
            if (!map.containsKey(b)) {
                return false;
            }
            map.put(b, map.get(b) - 1);
            if (map.get(b) == 0) {
                map.remove(b);
            }
        }
        
        // If the map is empty, the strings are anagrams
        return map.isEmpty();
    }
}
