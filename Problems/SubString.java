public class SubString {

    public static void main (String[] args) {

        String word = "swimsuit";
        String substring1 = "swim";
        String substring2 = "suit";

        System.out.println(isItSub(word, substring2));

    }

    //pass both string (swimsuit, swim) and return true if swim exists can use chartAt() and toCharArray()
    public static boolean isItSub(String str, String substr) {

        if(str.length() < substr.length()) {
            return false;
        }

        char[] haystack = str.toCharArray();
        char[] needle = substr.toCharArray();
        boolean curr = false;
        boolean prev = false;

        //for(int i = 0, j = 0; i<(haystack.length - (needle.length - 1)); i++) {
        for(int i = 0, j = 0; i<haystack.length; i++) {


            if(haystack[i] == needle[j]) {
                j++;
                curr = true;

                if(j == needle.length) {
                    return true;
                }
            }
            else{
                j = 0;
                curr = false;
                if(prev) {
                    i--;
                }
            }
            prev = curr;
        }

        return false;
    }
}