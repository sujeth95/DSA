import java.util.*;

public class SpiralMatrix {

    public static void printSpiral(int martrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = martrix.length-1;
        int endCol = martrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(martrix[startRow][j] + " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(martrix[i][endCol] + " ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(martrix[endRow][j] + " ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(martrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int martrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        printSpiral(martrix);
    }
}
