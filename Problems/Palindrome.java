public class Palindrome {
    public static void main(String[] args) {
        if (isAPalindrome ("ABCDBA"))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static boolean isAPalindrome (String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        if (str.length() <= 2)
            return true;
        else
            return isAPalindrome(str.substring(1,str.length() - 1));
    }
}