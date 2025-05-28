package Compiled.Patterns.TwoPointers;
//LC : 167
public class TwoSum2 {
//    TC - O(n)
//    SC - O(1)
//    1. Initialize 2 pointers :left and right
//    2. Run a loop till : left < right
//    3. Calculate the sum
//    4. If the sum == target  , return ans
//    5. Else if its < target , do left++
//    6. Or else , do right--;

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                return new int[]{left, right};
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
