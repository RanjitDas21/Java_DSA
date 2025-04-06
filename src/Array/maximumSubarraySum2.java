// Kadane's Algorithm
// Time Complexity - O(n)

package Array;

public class maximumSubarraySum2 {
    public static void main(String args[]) {
        int arr[] = {3, -4, 5, 4, -1, 7, -8};
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSum) maxSum = currSum;
            if(currSum < 0) currSum = 0;
        }
        System.out.println("max subarray sum = "+ maxSum);
    }
}
