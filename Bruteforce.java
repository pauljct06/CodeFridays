public class Bruteforce {
    public static void main(String[] args) {
        String password = "test";
        int maxLen = 4;

        System.out.println("Found password: " + findPass(password, maxLen));
    }

    public static String findPass(String password, int maxLen) {

        char[] charset = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};

        char[] currword = new char[4];

        for (int i=0; i<charset.length; i++) {
            currword[0] = charset[i];

            for (int j=0; j<charset.length; j++) {
                currword[1] = charset[j];

                for (int k=0; k<charset.length; k++) {
                    currword[2] = charset[k];

                    for (int l=0; l<charset.length; l++) {
                        currword[3] = charset[l];

                        // for (int m=0; m<charset.length; m++) {
                        //     currword[4] = charset[m];

                        //     for (int n=0; n<charset.length; n++) {
                        //         currword[5] = charset[n];

                                System.out.println(currword);

                                if ((new String(currword)).equals(password)) {
                                    return (new String(currword));
                                }
                           // }
                        //}
                    }
                }
            }
        }
        return "Password not found biatch!";
    }
}