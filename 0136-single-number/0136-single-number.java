class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        int s=nums.length;
        for(int i=0;i<s;i++){
            n^=nums[i];
        }
        return n;
        
    }
}