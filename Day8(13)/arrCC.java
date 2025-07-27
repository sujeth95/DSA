import java.util.*;

public class arrCC {
    public static void main(String[] args) {
       int marks[] = new int[100];

       Scanner src = new Scanner(System.in);
    //    int phy;
    //    phy = src.nextInt();

       marks[0] = src.nextInt();  // Physics
       marks[1] = src.nextInt();  // Chemistry
       marks[2] = src.nextInt();  // Mathematics

       System.out.println("Physics : " + marks[0]);
       System.out.println("Chemistry : " + marks[1]);
       System.out.println("Mathematics : " + marks[2]);
       
       marks[2] = marks[2] + 1;
       System.out.println("Mathematics : " + marks[2]);

       int percentage = (marks[0] + marks[1] + marks[2])/3;
       System.out.println("Percentage = " + percentage + "%");

       System.out.println("Length of array = " + marks.length);
    }
}
