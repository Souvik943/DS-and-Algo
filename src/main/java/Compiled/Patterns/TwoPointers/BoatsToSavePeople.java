package Compiled.Patterns.TwoPointers;

import java.util.Arrays;
//LC : 881
public class BoatsToSavePeople {
//    TC - O(nlogn)
//    SC - O(1)

//    1. Sort the array
//    2. We keep two pointers start and end
//    3. We run a loop till left <= right [**because whem=n left and right are at a single element , we need to include that also**]
//    4. We check :
//        5. If the left + right person can fit , If yes , then we do left++
//        6. By default we decrement the right-- and increment boats

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int totalBoatCount = 0;
        int left = 0;
        int right = people.length-1;
        while(left <= right) {
            if(people[left] + people[right] <= limit) left++;
            right--;
            totalBoatCount++;
        }
        return totalBoatCount;
    }
}
