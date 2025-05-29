package Compiled.Patterns.TwoPointers;


public class TrappingRainWater {
//    TC - O(n)
//    SC - O(n)

//    1. Maintain a varialble to return totalRainWater , leftArray and rightArray
//    2. leftArray contains the maxValue till that index , starting from the left
//    3. righArray contains the maxValue till that index , starting from the right
//    4. Initialise leftArray[0] = rainWater[0] and rightArray[rightArray.length-1] = rainwater[rainwater.length-1
//    5. Iterate through  the rainwater and fill both arrays
//    6. After filling the data , Iterate thorugh the rainwater array
//    7. Check if the rainwater[i] < leftArray[i] && raiwater[i] < rightArray[i]
//    8. Then use the formulae to calculate the totalRainWater :
//    9. totalRainWater += Math.min(leftArray[i], rightArray[i]) - rainwater[i]
//    10. Return it .

    public int trap(int[] height) {
        int n = height.length;
        int totalRainWater = 0;
        int[] prefixArray = new int[n];
        prefixArray[0] = height[0];
        int[] suffixArray = new int[n];
        suffixArray[n-1] = height[n-1];
        for(int i=1; i<n; i++) {
            prefixArray[i] = Math.max(prefixArray[i-1], height[i]);
        }
        for(int i=n-2; i>=0; i--) {
            suffixArray[i] = Math.max(suffixArray[i+1], height[i]);
        }
        for(int i=0; i<n; i++) {
            if(prefixArray[i] > height[i] && suffixArray[i] > height[i]) {
                totalRainWater += Math.min(prefixArray[i], suffixArray[i]) - height[i];
            }
        }
        return totalRainWater;
    }
}
