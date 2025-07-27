import java.util.*;

public class incomeTax {
    public static void main(String[] arg){
        Scanner src = new Scanner (System.in);
        System.out.print("Enter Your income: ");
        int income = src.nextInt();

        //------ WRONG ANSWER ------
        // if(income < 500000){
        //     System.out.println("0% Tax.");
        // }
        // else if(income > 500000 && income < 1000000){
        //     System.out.println("20% Tax.");
        // }
        // else{
        //     System.out.println("30% Tax.");
        
        //------ CORRECT ANSWER --------
            int tax;

            if(income < 500000){
                tax = 0;
            }
            else if(income >= 500000 && income < 100000){
                tax = (int) (income * 0.2);
            }
            else{
                tax = (int) (income * 0.3);
            }

            System.out.println("Your tax is: " + tax);
        }
    }
