// Problem: Longest subarray with sum <= K
// Approach: Sliding Window (Variable Window)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LongestSubarraySumAtMostK {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 7, 10};
        int K = 14;
        int start = 0;
        int currentSum = 0;
        int maxLength = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            // shrink window if sum exceeds K
            while (currentSum > K) {
                currentSum -= arr[start];
                start++;
            }
            // update max length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println("Longest subarray length = " + maxLength);
    }
}
