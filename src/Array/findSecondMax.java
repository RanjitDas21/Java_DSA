//Find the second maximum number of an Array(Answer always exists).

package Array;

import java.util.Scanner;

public class findSecondMax {

    static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int arr[]) {
        int mx = findMax(arr);
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }


    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 1, 10, 8};
//        int arr2[] = {1, -5, -8, -10 ,-3};
        int finalResult = findSecondMax(arr);
        System.out.println("The second maximum number is : " +finalResult);

    }
}
