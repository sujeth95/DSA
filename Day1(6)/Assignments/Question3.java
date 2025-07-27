import java.util.*;

public class Question3 {
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        float pencil = scn.nextFloat();
        float pen = scn.nextFloat();
        float eraser = scn.nextFloat();
        float totalPrice = (pencil + pen + eraser);

        System.out.println(totalPrice);

    }
}
