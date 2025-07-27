import java.util.*;

public class PassFail {
    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = src.nextInt();

        String status = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(status);
    }   
}
