class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        unordered_map<int,int> unique;
        
        for (int num: nums){
            unique[num]++;
        }
        
        int sum = 0;
        
        for(auto i : unique){
            if(i.second < 2){
            sum = sum + i.first;}
        }
        return sum;
    }
};