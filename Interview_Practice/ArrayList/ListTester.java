public class ListTester {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println("Initial size: " + list.getTrueSize());
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        System.out.println("Post resize: " + list.getTrueSize());
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(22);

        System.out.println("Get test: " + list.get(3));
    }
}