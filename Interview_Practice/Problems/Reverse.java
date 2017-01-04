 // input: "Hello World"
 // output: "World Hello"

 public class Reverse {
    public static void main (String[] args) {
        String str = "Hello";
        System.out.println(reverseSentence2(str));
    }

    public static String reverseSentence(String s) {
        String[] ans = s.split("\\s+");
        String result = "";
        for (int i = ans.length - 1; i >= 0; i--) {
            result += ans[i];
            if (i != 0) {
                result += " ";
            }
        }
        return result;
    }

    public static String reverseSentence2(String s) {
        // reverse entire string
        // iterate through new reverse string
        // if not a whitespace add it to temp String
        // if space reverse temp String and add it to ans String with a space at the end
        // reset temp String and repeat the process

        String rev = reverseWord(s);
        String temp = "";
        String ans = "";
        System.out.println(rev);

        // Hello World
        // dlrow olleH

        // tmp = d
        // tmp = dl
        // tmp = dlr
        // tmp = dlro
        // tmp = dlrow

        // ans = world
        // tmp = ""

        // tmp = o
        // tmp = ol
        // tmp = oll
        // tmp = olle
        // tmp = olleH

        // ans + tmp
        // return ans

        for (int i=0; i<rev.length(); i++) {
            if (rev.charAt(i) != ' ') {
                temp += rev.charAt(i);
            }
            else {
                ans += reverseWord(temp);

                if (i != rev.length()-1) {
                    ans += " ";
                }
                temp = "";
            }

        }
        ans += reverseWord(temp);
        return ans;
    }

    public static String reverseWord (String word) {
        String ans = "";

        for (int i=word.length() - 1; i >= 0; i--) {
            ans += word.charAt(i);
        }
        return ans;
    }
 }


