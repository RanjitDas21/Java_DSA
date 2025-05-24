// Given an array of integers "arr" and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

package Array;

public class pairSum {
    static int[] calculatePairSum(int arr[], int terget) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == terget) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) {
        int arr[] = {12, 7, 2, 15};

        int ans[] = calculatePairSum(arr, 9);
        for(int val: ans) {
            System.out.println(val+" ");
        }

    }
}
