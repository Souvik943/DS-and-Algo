package Compiled.Patterns.ArraysAndHashing;
//LC : 238
public class ProductOfArrayExceptSelf {

//    TC - O(n)
//    SC - O(n)
//    1. Maintain 2 arrays left[] and right[]
//    2. Make the first element of left as 1 and last element of right as 1
//    3. Then we iterate through left array and fill acc to : left[i] = left[i-1] * nums[i-1]
//    4. And for right as follows : right[i] = right[i+1] * nums[i+1]
//    5. At the end we multiply both the left and right elements .

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] leftArray = new int[n];
        int[] rightArray = new int[n];
        leftArray[0] = 1;
        rightArray[rightArray.length-1] = 1;
        for(int i=1; i<leftArray.length; i++) {
            leftArray[i] = nums[i-1] * leftArray[i-1];
        }
        for(int i=rightArray.length-2; i>=0; i--) {
            rightArray[i] = rightArray[i+1] * nums[i+1];
        }
        for(int i=0; i<n; i++) {
            res[i] = leftArray[i] * rightArray[i];
        }
        return res;
    }
}
