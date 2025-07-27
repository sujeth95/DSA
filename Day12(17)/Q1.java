// package Day12(17);

public class Q1 {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // condition for not a palindrome
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}
