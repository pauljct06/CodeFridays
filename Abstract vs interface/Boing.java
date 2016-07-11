public class Boing extends plane implements vehicle {

    public void turnsOn() {
        System.out.println("Boeing plane is on");
    }

    public void getHelp() {
        System.out.println("calling aviation tech");
    }

    public static void main(String[] args) {

        boing x = new boing();

        x.turnsOn();
        x.getHelp();
        x.flies();

    }
}