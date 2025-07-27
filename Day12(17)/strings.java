
// package Day12(17);
import java.util.*;

public class strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE.

        // Scanner src = new Scanner(System.in);
        // String name;
        // name = src.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length()); //NOTE: in String .length is a
        // function so we use () in length.

        // Concatenation -> Joining two things.
        String firstName = "Sujeet";
        String lastName = "Oraon";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName + " is this.");

        printLetters(fullName);
    }
}
