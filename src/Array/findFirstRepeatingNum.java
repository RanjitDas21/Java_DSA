// Given an Array "arr" consisting of integer. Return the first value that is repeating in this array.
// If no value is being repeated,return -1.

package Array;

public class findFirstRepeatingNum {

    static int findFirstRepeatingNumber(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 2, 5, 4};
        int finalResult = findFirstRepeatingNumber(arr);
        System.out.println("The first repeating number is : " +finalResult);

    }
}
