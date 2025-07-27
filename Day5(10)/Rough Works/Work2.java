import java.util.*;

public class Work2 {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = src.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=(num-i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
