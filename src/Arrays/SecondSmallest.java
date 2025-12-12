// Problem: Find the second smallest element in an array
// Approach: Track 'smallest' and 'secondSmallest'
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest; // update second
                smallest = num;            // update first
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second smallest element = " + secondSmallest);
    }
}
