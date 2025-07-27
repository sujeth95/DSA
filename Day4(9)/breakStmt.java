import java.util.*;

public class breakStmt {
    public static void main(String arg[]){
        for (int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");
    }
}
