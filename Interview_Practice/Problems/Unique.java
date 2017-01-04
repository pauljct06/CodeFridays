// a string
// abbccdefffgghhiafe
// get only the unique

public class Unique {
    public static void main (String[] args) {

        String str = "abbccdefffgghhiafe";
        System.out.println(removeDuplicate(str));
    }

    public static String removeDuplicate (String s) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i<alphabet.length; i++) {
            alphabet[i] = false;
        }

        char[] arr = s.toCharArray();

        for (int i=0; i<arr.length; i++) {
            alphabet[arr[i] - 'a'] = true;
        }

        String ans = " ";

        for (int i=0; i<alphabet.length; i++) {
            if(alphabet[i]) {
                ans += (char) (i + 'a');
            }
        }
        return ans;
    }

}