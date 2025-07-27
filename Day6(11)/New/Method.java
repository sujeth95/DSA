// package New;

public class Method {
    public static void printS() {
        int s = 4;  //NOTE: (s) cannot be access outside of this function, even after (s) is made to return.
        // return s;
    }
    public static void main(String[] args) {
        int s = 45;
        System.out.println(s);
    }
}
