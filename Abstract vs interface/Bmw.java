public class Bmw extends Car implements Vehicle {

    public void turnsOn() {

        System.out.println("Bmw car is on");
    }

    public void getHelp() {
        System.out.println("calling Road side assistance");
    }

    public static void main(String[] args) {

        Bmw x = new Bmw();

        x.turnsOn();
        x.getHelp();
        x.drives();

    }
}

