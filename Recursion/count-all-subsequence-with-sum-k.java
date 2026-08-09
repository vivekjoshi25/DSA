class Solution {

    public int countSubsequence(int index, int sum, int k, int[] arr) {

        // Base case
        if (index == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        // Take
        int take = countSubsequence(
            index + 1,
            sum + arr[index],
            k,
            arr
        );

        // Not take
        int notTake = countSubsequence(
            index + 1,
            sum,
            k,
            arr
        );

        return take + notTake;
    }
}