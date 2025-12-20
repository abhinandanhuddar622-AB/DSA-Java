// Problem: Two Sum
// Approach: HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(
                        "Indices: " + map.get(complement) + " and " + i
                );
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No two sum solution found");
    }
}
