// Given an integer array "arr", return the prefix sum/running sum in the same array without creating a new array.

package Array;

public class prefixSum_2 {
    static void prefixSumArray(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 3, 4, 5};

        prefixSumArray(arr);
        for(int val: arr) {
            System.out.print(val+" ");
        }
    }
}
