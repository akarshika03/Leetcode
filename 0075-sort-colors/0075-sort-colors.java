class Solution {
    public void sortColors(int[] nums) {
        int z=0,on=0,nn=nums.length;
        for(int n: nums){
            if(n==0){
                z++;
            }
            else if(n==1){
                on++;
            }
        }
        for(int i=0; i<z; i++){
            nums[i]=0;
        }
        for(int i=z; i<z+on; i++){
            nums[i]=1;
        }
        for(int i=z+on; i<nums.length; i++){
            nums[i]=2;
        }
    }
}