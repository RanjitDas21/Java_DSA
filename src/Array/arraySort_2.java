//Move the all even elements at the beginning of the array.Relative order does not matter.

package Array;

import java.util.Scanner;

public class arraySort_2 {

    static void sortArray(int arr[]) {
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] % 2 == 0) {
                left++;
            }
            if(arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 1, 6, 4, 9, 3};
        sortArray(arr);
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
