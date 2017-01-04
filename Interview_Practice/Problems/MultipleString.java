public class MultipleString {

    public static void main (String[] args) {

        String A = "aaabbcdddffg";
        //  String should be displayed as a3b2cd3f2g

        System.out.println(stringCounter(A));
    }

        public static String stringCounter(String A) {

            String B = "";
            for (int i = 0; i < A.length()-1; i++) {

                int count = 1;

                while(A.charAt(i) == A.charAt(i+1)) {
                    count++;
                    i++;
                }

                if (count > 1) {
                  B = B + A.charAt(i) + "" + count;
                }
                else {
                    B = B + A.charAt(i) + "";
                }

            }

            B = B + A.charAt(A.length()-1) + "";

            return B;
        }
}