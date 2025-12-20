// Problem: Find the union of two arrays (all unique elements)
// Approach: Use HashSet to eliminate duplicates
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

import java.util.HashSet;
public class ArrayUnion {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 4, 5};
        HashSet<Integer> set = new HashSet<>();

        // Add elements of arr1
        for (int num : arr1) {
            set.add(num);
        }
        // Add elements of arr2
        for (int num : arr2) {
            set.add(num);
        }
        // Print union
        System.out.print("Union elements: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
