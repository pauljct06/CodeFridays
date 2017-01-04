public class TheValue {
    public static void main(String[] args) {
        System.out.println(theVal(1,7,7));
    }

    public static int theVal(int A, int B, int N) {
        int returnVal;
        System.out.println("Enter: A = " + A + " B = " + B);

        int C = (A + B) /  2;
        if (C * C <= N)
            returnVal = C;
        else
            returnVal = theVal(A, C-1, N);

        System.out.println("Leave: A = " + A + " B = " + B);
        return returnVal;
    }
}