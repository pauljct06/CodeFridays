import java.util.HashMap;

public class Solutions {

    public static void main(String[] args) {

        // System.out.println(isAnagram("abcd", "dcba"));

        System.out.println(isPalindrome("ABCDCBA"));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();

        for (int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) {
                return false;
            }
        }

        return true;
    }

    // O(n^2)
    // public static boolean isAnagram(String str1, String str2) {
    //     int len1 = str1.length();
    //     int len2 = str2.length();

    //     if (len1 != len2) {
    //         return false;
    //     }

    //     if (len1 == 0) {
    //         return true;
    //     }

    //     boolean charExists;

    //     for (int i=0; i<len1; i++) {
    //         charExists = false;

    //         for (int j=0; j<len2; j++) {
    //             if (str1.charAt(i) == str2.charAt(j)) {
    //                 charExists = true;
    //                 break;
    //             }
    //         }

    //         if (!charExists) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }


    // O(n log n)
    // public static boolean isAnagram(String str1, String str2) {
    //     int len1 = str1.length();
    //     int len2 = str2.length();

    //     if (len1 != len2) {
    //         return false;
    //     }

    //     if (len1 == 0) {
    //         return true;
    //     }

    //     char[] str1Array = str1.toCharArray();
    //     char[] str2Array = str2.toCharArray();

    //     Arrays.sort(str1Array);
    //     Arrays.sort(str2Array);

    //     str1 = new String(str1Array);
    //     str2 = new String(str2Array);

    //     return (str1.equals(str2));
    // }


    // O(n)
    // public static boolean isAnagram(String str1, String str2) {
    //     int len1 = str1.length();
    //     int len2 = str2.length();

    //     if (len1 != len2) {
    //         return false;
    //     }

    //     if (len1 == 0) {
    //         return true;
    //     }

    //     HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

    //     for (int i=0; i<len1; i++) {
    //         hashmap.put(str1.charAt(i), 1);
    //     }

    //     for (int i=0; i<len2; i++) {
    //         if (!hashmap.containsKey(str2.charAt(i))) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }
}