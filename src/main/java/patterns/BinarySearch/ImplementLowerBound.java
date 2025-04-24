package patterns.BinarySearch;
//Intuition :
//1. Implement a binary search template : low , high and mid
//2. Maintain a loop till low <= high
//3. If arr[mid] >= x , then we assume it can be our ans ,so we assign result as mid but we need to search further in the left , so we shift high = mid-1
//4. Else we need to search in right half , hence left = mid + 1
//5. Return ans
public class ImplementLowerBound {
    public static void main(String[] args) {
        System.out.println(implementLowerBound(new int[]{1, 2, 2, 3, 3, 5}, 7 ));
    }

    private static int implementLowerBound(int[] arr, int x) {
        int n = arr.length;
        int result = n;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(arr[mid] >= x) {
                result = mid;
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }
}
