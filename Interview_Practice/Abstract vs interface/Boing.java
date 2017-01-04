public class Boing extends Plane implements Vehicle {

    public void turnsOn() {
        System.out.println("Boeing plane is on");
    }

    public void getHelp() {
        System.out.println("calling aviation tech");
    }

    public static void main(String[] args) {

        Boing x = new Boing();

        x.turnsOn();
        x.getHelp();
        x.flies();

    }
}