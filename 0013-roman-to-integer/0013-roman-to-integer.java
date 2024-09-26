class Solution {
    public int romanToInt(String s) {
        // Create a map to store Roman numeral values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            int first = map.get(s.charAt(i));
            
            // Check if the next character exists and is larger than the current one
            if (i + 1 < s.length()) {
                int second = map.get(s.charAt(i + 1));
                
                if (first < second) {
                    ans += (second - first);
                    i++; // Skip the next character since it's part of the pair
                } else {
                    ans += first;
                }
            } else {
                ans += first; // Add the last character value
            }
        }
        
        return ans;
    }
}
