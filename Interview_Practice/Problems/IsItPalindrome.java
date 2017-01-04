//check if a string is a palindrome

public class IsItPalindrome {
    public static void main(String[] args) {
        String pali = "bbacza"
        System.out.println(isItPalindrome(pali));
    }

    // public static boolean couldBeAPalindrome(String s) {
    //     char[] pali = s.toCharArray();
    //     Map<String,
    // }

    public static boolean isItPalindrome(String s) {
        char[] pali = s.toCharArray();
        int size = pali.length;
        int head = 0;
        int tail = size - 1;

        while (head <= tail) {
            if (pali[head] != pali[tail]) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

}