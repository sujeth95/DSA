import java.util.*;

public class CharPrint {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = src.nextInt();
        char ch = 'a';
        //outer loop
        for(int line=1;line<=n;line++){
            //inner loop
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
