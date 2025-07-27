// package New;

public class FactorialNum {
    public static int factorial(int n){
        int f=1;

        for(int i=1; i<=n; i++){
            f = f * i;
        }

        return f;  //factorial of n
    }
    public static void main(String[] args) {
        //Calculating Factorial of Number.

        System.out.println(factorial(7));
    }
}
