class Solution {
    public int searchInsert(int[] nums, int target) {
       int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
            }
            else if(i>0&&nums[i]>target&&nums[i-1]<target){
                index=i;
            }
            else if(nums[i]<target){
                index=i+1;
            }
        }
       return index; 
    }
}