public class Recursion {

    public static void main(String[] args) {
        System.out.print(foo(3));
    }

    public static int foo(int n) {
        if (n == 0)
            return 1;
        else
            return 2 * foo(n-1);
    }
}
