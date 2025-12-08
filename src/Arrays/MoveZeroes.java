// Problem: Move all zeroes to the end of the array
// Approach: Two-pointer method
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int j = 0;      // pointer to track position of non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                       // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.print("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



