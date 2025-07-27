import java.util.*;

public class Work1 {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = src.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
