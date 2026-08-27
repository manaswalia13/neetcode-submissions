class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m1=new HashMap<>();
for(int n=0;n<nums.length;n++){
        int diff=target-nums[n];

            if(m1.containsKey(diff)){
                return new int[] {m1.get(diff),n};
            }
            m1.put(nums[n], n);


        }
        return new int[] {};
    

    }
}
