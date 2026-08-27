class Solution {
    public int[] replaceElements(int[] arr) {
        // The last element will always be replaced by -1
        int maxSoFar = -1; 
        
        // Loop backwards starting from the end of the array
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. Save the current value before we overwrite it
            int temp = arr[i];
            
            // 2. Replace the current slot with the biggest number we've seen to the right
            arr[i] = maxSoFar;
            
            // 3. Update the biggest number we've seen (for the next loop iteration)
            maxSoFar = Math.max(maxSoFar, temp); 
        }
        
        return arr;
    }
}