package Recursion;

public class findFirstIndex {

    public static int findFirstIdx(int arr[], int target, int n, int idx) {
        //Base case
        if(idx == n) return -1;
        // Self work
        if(arr[idx] == target) return idx;
        // subProblem
        return findFirstIdx(arr, target, n, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,7,1,7,9};
        int target = 7;
        System.out.println(findFirstIdx(arr,target,arr.length,0));

    }
}
