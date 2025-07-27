import java.util.*;

public class Work3 {
    public static void main(String arg[]){
        Scanner src = new Scanner (System.in);
        System.out.print("Enter Your Number: ");
        int num = src.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
