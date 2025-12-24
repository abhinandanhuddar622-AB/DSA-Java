// Problem: Find subarray with given sum (positive numbers)
// Approach: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        int start = 0;
        int currentSum = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
              // Shrink window if sum is greater than target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == target) {
                System.out.println(
                        "Subarray found from index " + start + " to " + end
                );
                return;
            }
        }
        System.out.println("No subarray found");
    }
}
