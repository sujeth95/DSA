package New;

public class BlockScope {
    public static void main(String[] args) {
        // int p = 10;  //Global Variable.
        // {
        //     int s = 45;  //Locial Variable.
        //     System.out.println(p);
        // }
        // // System.out.println(s);
        // System.out.println(p);

        for(int i = 1; i<=5; i++){
            //(i) cannot be used out of this curly brakets.
        }
        int i = 4;
        System.out.println(i);  //Output: 4
    }
}
