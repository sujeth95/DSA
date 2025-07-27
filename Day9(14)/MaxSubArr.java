// Check the error in this code. 
import java.util.*;

public class MaxSubArr {
    public static void printMaxSubArrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        // int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=1; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){  //Print
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.print(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printMaxSubArrays(numbers);
    }
}
