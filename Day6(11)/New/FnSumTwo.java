// package New;

public class FnSumTwo {
    //Function to calculate sum of 2 numbers.
    public static int sum(int a, int b){
        return a + b;
    }

    //Function to calculate sum of 3 numbers.
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        
        System.out.println("From function 2: " + sum(3,5));
        System.out.println("From function 3: " + sum(5,2,1));
    }
}
