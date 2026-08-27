class Solution {
    public int[] getConcatenation(int[] nums) {
        int j=nums.length;
        int [] output=new int[j*2];

        for(int i=0;i<j;i++){
            output[i]=nums[i];
            output[i+j]=nums[i];
        }
        
        return output;
    }
}