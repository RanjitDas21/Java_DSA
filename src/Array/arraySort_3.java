// Given an integer array "arr" sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.

package Array;

public class arraySort_3 {
    static void reverse(int arr[]) {
        int i = 0, j = arr.length-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[] sortSquares(int arr[]) {
        int n = arr.length;
        int left = 0, right = n-1, k = 0;
        int ans[] = new int[n];

        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }

        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {-10, -3, -2, 1, 4, 5};
        int ans[] = sortSquares(arr);
        System.out.println("Sorted array: ");
        reverse(ans);
        for(int val: ans) {
            System.out.print(val+" ");
        }
    }
}
