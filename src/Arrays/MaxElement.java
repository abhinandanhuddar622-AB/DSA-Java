// problem: Find maximum element in an array
// Approach: Linear scan
// Time comlexity: O(n)
// Space Complexity: O(1)

package Arrays;

public class MaxElement {
    public static void main(String[] args){
        int[] arr={10,50,20,90,40};
        int max=arr[0]; //Assume that first element is maximum
        for(int i=1;i< arr.length;i++){  //start from 1
            if(arr[i]>max){ //if current value is max
                 max=arr[i];
            }
        }
        System.out.println("maximum element = "+max);
    }
}
