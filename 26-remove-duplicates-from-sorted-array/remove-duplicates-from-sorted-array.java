class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int size=nums.length;
        for(int i=1;i<size;i++){
            if(nums[i]!=nums[k]){
                k++;
                nums[k]=nums[i];
                
            }
            
        }
        return k+1;
        
    }
}