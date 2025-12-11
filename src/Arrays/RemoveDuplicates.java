// Problem: Remove duplicates from a sorted array
// Approach: Two-pointer technique
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int i = 0;   // pointer to track unique elements
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {   //1st element is not= to 0th
                i++;
                arr[i] = arr[j];
            }
        }
        // Print unique part of array
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
