class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int size=nums.length;
        for(int i=1;i<size;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
        
    }
}