class Solution {
    public int majorityElement(int[] nums) {
        
//         In this question we are using Moore's Voting Alogorithm
        
        int candidate = 0;
        int vote = 0;
        
        for(int i : nums) {
            if (vote == 0) {
                candidate = i;
            }
            
            if (candidate == i) {
                vote++;
            } else {
                vote--;
            }
        }
        
        return candidate;
    }
}
