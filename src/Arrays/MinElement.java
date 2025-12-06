// Problem: Find minimum element in an array
// Approach: Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

    public class MinElement {
        public static void main(String[] args) {

            int[] arr = {20,50,10,90,40};

            int min = arr[0]; // assume first element is minimum

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) { // if current element is smaller
                    min = arr[i];
                }
            }

            System.out.println("Minimum element = " + min);
        }
    }


