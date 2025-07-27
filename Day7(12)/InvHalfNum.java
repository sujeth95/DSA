import java.util.*;

public class InvHalfNum {
    public static void inverted_half_pyramid_withNumber(int n){
        for(int i=1; i<=n; i++){
            //Inner Loop -> Numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = src.nextInt();
        inverted_half_pyramid_withNumber(5);
    }
}