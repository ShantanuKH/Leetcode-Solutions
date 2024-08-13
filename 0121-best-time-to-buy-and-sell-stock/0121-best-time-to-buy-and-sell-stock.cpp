class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int minval = prices[0];
        int maxval = 0;

        for (int i = 1; i < prices.size(); i++) {
            if (minval > prices[i]) {
                minval = prices[i];
            }

            maxval = max(maxval, prices[i] - minval);
        }

        return maxval;        
    }
};