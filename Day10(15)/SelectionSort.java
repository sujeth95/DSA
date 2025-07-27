// package Day10(15);
import java.util.*;

public class SelectionSort {

    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn<arr.length-1; turn++) {  //Takes n turns
            for(int j=0; j<arr.length-1-turn; j++){     //Takes n-1-turns
                if(arr[j] > arr[j+1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){  //TC-> O(n^2)
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            //NOT TO SWAP IN THIS LOOP
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        printArr(arr);
    }
}
