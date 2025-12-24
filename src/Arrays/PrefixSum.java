// Problem: Range sum query using Prefix Sum
// Time Complexity: O(n) preprocessing, O(1) per query
// Space Complexity: O(n)

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        // Build prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // Query: sum from index L to R
        int L = 0;
        int R = 3;
        int rangeSum;
        if (L == 0) {
            rangeSum = prefix[R];
        } else {
            rangeSum = prefix[R] - prefix[L - 1];
        }
        System.out.println("Sum from index " + L + " to " + R + " = " + rangeSum);
    }
}
