package Compiled.Patterns.TwoPointers;
//LC : 11
public class ContainerWithMostWater {
//    TC : O(n)
//    SC : O(1)

//    1. left = 0 , right = n-1 , maxCapacity = -1
//    2. We maintain a loop while(left < right)
//        3. We calculate the capacity as :  int currentCapacity = (Math.min(height[left], height[right])) * (right-left);
//        4. We compare and store maxCapacity and currentCapacity
//        5. If height[left] < height[right] , we do start++;
//        6. Else end--;
//    7. return maxCapacity

    public int maxArea(int[] height) {
        int maxCapacity = -1;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while(left < right) {
            int currentCapacity = (Math.min(height[left], height[right])) * (right-left);
            maxCapacity = Math.max(currentCapacity, maxCapacity);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxCapacity;
    }
}
