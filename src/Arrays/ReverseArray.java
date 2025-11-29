//Problem: Reverse an array
//Approach: Two pointers
//Time Complexity:O(n)
//Space Complexity:O(1)

package Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int start=0,end= arr.length-1;//there the 0 means first element(1)
        // and -1 means last element(5)
        while (start<end){  //1<5 ==true
            int temp=arr[start]; //aar[start] stored in temp
            arr[start]=arr[end]; //
            arr[end]=temp;
            start++; //start is incrementing
            end--;   //end is decrementing
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
