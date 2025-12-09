// Problem: Find the missing continuous number from an array containing numbers from 0 to n
// Approach: Use sum formula -> missing = totalSum - arraySum
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 4};  //only  continuous numbers
        int n = arr.length;       // array size is n but numbers range from 0 to n
        int totalSum = n * (n + 1) / 2;   //n=4 , 4*(4+1)/2 = 10
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;     //arraySum 0+1+3+4=8
        }
        int missing = totalSum - arraySum;  //totalSum=10,arraySum=8, 10-8 = 2
        System.out.println("Missing number is: " + missing);  //missing no =2
    }
}

