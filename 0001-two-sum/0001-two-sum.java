class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] L= new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    L[0]=i;
                    L[1]=j;
                    return L;
                }
            }
        }
        return L;
    }
}