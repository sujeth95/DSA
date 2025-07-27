import java.util.*;

public class DiagonalSum {
    
    public static int diagonalSum(int matrix[][]){ //TC -> O(n^2)
        int sum = 0;

        // //AVOIDING CAUSE IT'S TIME COMPLEXITY IS MORE SO NOT AN IDEAL CODE TO WRITE.
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         //PRIMARY DIAGONAL
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         }
        //         //SECONDARY DIAGONAL
        //         else if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){  //TC -> O(n)
            //Primary Diagonal
            sum += matrix[i][i];
            //Secondary Diagonal
            if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length-i-1];
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        int martrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int ans = diagonalSum(martrix);
        System.out.println(ans);
    }
}
