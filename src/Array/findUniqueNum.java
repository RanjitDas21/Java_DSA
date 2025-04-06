// Find the unique number in a given Array where all the elements are being respected twice
// with one value being unique(Only positive elements are present in array).

package Array;

import java.util.Scanner;

public class findUniqueNum {
    static int findUnique(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 7, 9, 1, 3};
        int result = findUnique(arr);
        System.out.println("The unique number is : " +result);

    }
}
