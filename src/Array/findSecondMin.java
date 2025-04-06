//Find the second minimum number of an Array(Answer always exists).

package Array;

public class findSecondMin {
    static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int arr[]) {
        int min = findMin(arr);
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMin(arr);
        return secondMin;
    }


    public static void main(String[] args) {
        int arr[] = {3, 0, 7, 9, 8, 0};
//        int arr2[] = {-1, -10, 5, -5, -10};
        int finalResult = findSecondMin(arr);
        System.out.println("The second minimum number is : " +finalResult);

    }
}
