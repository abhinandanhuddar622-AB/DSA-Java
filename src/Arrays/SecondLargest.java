// problem: Find the secondlargest element in an array
// Approach: Track 'largest' and 'secondLargest'
// Time complexity: O(n)
// space complexity: O(1)

public class SecondLargest {
public static void main(String[] args){
    int[] arr={10,50,20,90,40,70};
    int largest=Integer.MIN_VALUE;           //helper variables
    int secondLargest=Integer.MIN_VALUE;

    for(int num:arr){              //loop goes through every num in the array.
        if(num>largest){
            secondLargest=largest; //update second largest
            largest=num;           //update largest
        }else if(num>secondLargest&&num !=largest){
            secondLargest=num;
        }
    }
    System.out.println("Largest element is: "+largest); //optional
    System.out.println("Second largest element is: "+secondLargest);
}
}
