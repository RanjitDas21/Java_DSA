package Array;

public class maximumSubarraySum {
    public static void main(String args[]) {
        int arr[] = {3, -4, 5, 4, -1, 7, -8};
        int maxSum = Integer.MIN_VALUE;

        // Brute Force Approach(Basic and Simple Approach)
        // Time Complexity- O(n2)
        for(int st = 0; st < arr.length; st++) {
            int currSum = 0;
            for(int end = st; end < arr.length; end++) {
                currSum += arr[end];
                if(currSum > maxSum) maxSum = currSum;
            }
        }
        System.out.println("max subarray sum = "+ maxSum);
    }
}
