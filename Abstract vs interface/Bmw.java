public class Bmw extends car implements vehicle {

    public void turnsOn() {

        System.out.println("Bmw car is on");
    }

    public void getHelp() {
        System.out.println("calling Road side assistance");
    }

    public static void main(String[] args) {

        bmw x = new bmw();

        x.turnsOn();
        x.getHelp();
        x.drives();

    }
}

