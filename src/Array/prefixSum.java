// Given an integer array "arr", return the prefix sum/running sum.

package Array;

public class prefixSum {
    static int[] prefixSumArray(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }


    public static void main(String args[]) {
        int arr[] = {2, 1, 3, 4, 5};

        int ans[] = prefixSumArray(arr);
        for(int val: ans) {
            System.out.print(val+ " ");
        }
    }
}
