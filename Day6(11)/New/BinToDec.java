// package New;
import java.util.*;

public class BinToDec {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;   //NOTE: To find the last digit of any number always divide(%) the number with 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of " + myNum + " = " + decNum);
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = src.nextInt();
        binToDec(n);
    }
}
