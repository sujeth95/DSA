// package New;

public class FnOver {
    //Function to calculate int sum.
    public static int sum(int a, int b){
        return a+b;
    }

    //Function to calculate float sum.
    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String args[]){
        
        System.out.println("From function int: " + sum(3,5));
        System.out.println("From function float: " + sum(5.2f,4.8f));
    }
}
