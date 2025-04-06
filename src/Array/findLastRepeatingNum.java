// Given an Array "arr" consisting of integer. Return the last value that is repeating in this array.
// If no value is being repeated,return -1.

package Array;

public class findLastRepeatingNum {
    static int findLastRepeatingNumber(int arr[]) {
        int n = arr.length;
        int ans = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4, 8, 10, 8, 2, 4, 2};
        int finalResult = findLastRepeatingNumber(arr);
        System.out.println("The last repeating number is : " +finalResult);

    }
}
