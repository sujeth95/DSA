import java.util.*;

public class SortedMatrix {

    public static boolean staircaseSearch(int martrix[][], int key){
        int row = 0, col = martrix[0].length-1;

        while(row<martrix.length && col >= 0){
            if(martrix[row][col] == key){
                System.out.println("Found key at (" + row + "," + col +")");
                return true;
            }

            else if(key < martrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        System.out.println("Key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int martrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 33;

        staircaseSearch(martrix, key);
    }
}
