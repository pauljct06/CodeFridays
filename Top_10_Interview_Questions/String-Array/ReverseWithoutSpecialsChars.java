/**
* Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the
* string in a way that special characters are not affected
* Example:
* Input:   str = "a,b$c"
* Output:  str = "c,b$a"
* Note that $ and , are not moved anywhere.
* Only subsequence "abc" is reversed
*
* Input:   str = "Ab,c,de!$"
* Output:  str = "ed,c,bA!$
*/

public class ReverseWithoutSpecialsChars {
  public static void main(String[] args) {
    String input = "a,b$c";
    String output = reverseWithoutSpecialChars(input);
    System.out.println(output);
  }

  public static String reverseWithoutSpecialChars(String str) {
    char[] arr = str.toCharArray();
    int head = 0;
    int tail = str.length() - 1;

    while (head <= tail) {
      if (isItAlphabet(arr[head]) && isItAlphabet(arr[tail])) {
        char temp = arr[head];
        arr[head] = arr[tail];
        arr[tail] = temp;
        head++;
        tail--;
      }

      if (!isItAlphabet(arr[head])) {
        head++;
      }

      if (!isItAlphabet(arr[tail])) {
        tail--;
      }
    }

    return new String(arr);
  }

  public static boolean isItAlphabet(char letter) {
    if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
      return true;
    }

    return false;
  }
}
