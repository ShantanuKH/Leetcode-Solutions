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
       
        for (int i = 0; i < s.length(); i++) {
            int first = map.get(s.charAt(i));
            
            if (i + 1 < s.length()) {
                int second = map.get(s.charAt(i + 1));
                
                if (first < second) {
                    ans += (second - first);
                } else {
                    ans += first;
                }
            } else {
                ans += first; 
            }
        }
        
        return ans;
    }
}
