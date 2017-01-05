public class Honda extends car implements vehicle {

    public void turnsOn() {

        System.out.println("Honda car is on");
    }

    public void getHelp() {
        System.out.println("calling AAA");
    }
    public static void main(String[] args) {

        honda x = new honda();

        x.turnsOn();
        x.getHelp();
        x.drives();

    }
}