public class DuplicateChar {

    public static void main (String[] args) {





        String word = args[0];
        System.out.println(args[1]);

        System.out.println(HasDuplicate(word));
    }

    public static boolean HasDuplicate(String srt) {

        char[] strArray = srt.toCharArray();
        boolean[] map = new boolean[26];

        for (int i = 0; i < strArray.length; i++) {

            if (map[(strArray[i] - 'a')]) {

                return true;
            }
            map[(strArray[i] - 'a')] = true;
        }

        return false;
    }
}