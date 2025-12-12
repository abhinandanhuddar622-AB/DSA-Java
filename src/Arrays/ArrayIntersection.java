// Problem: Find intersection of two arrays (common elements)
// Approach: Use HashSet to store and check elements
// Time Complexity: O(n + m)
// Space Complexity: O(n)

import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store elements of arr1
        for (int num : arr1) {
            set.add(num);
        }
        // Check elements of arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);  // avoids duplicates
            }
        }
        // Print results
        System.out.print("Intersection elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}