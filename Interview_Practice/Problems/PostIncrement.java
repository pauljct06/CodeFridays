public class PostIncrement  {
    // This proves how the post increment works
    public static void main(String[] args) {
        int x = 2;
        //x = (x++) + (++x) + x + 1;
        x = (x++) + x + 1;
        System.out.println(x);
    }
}