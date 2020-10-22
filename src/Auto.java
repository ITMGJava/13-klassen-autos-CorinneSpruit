public class Auto {

    int snelheid;
    String merk;
     int kilometerstand = 1000;


    public static void main(String[] arg) {

        Auto auto1 = new Auto();
        auto1.snelheid = 0;
        auto1.merk = "Toyota";
        //  auto1.getKilometerstand();

        Auto auto2 = new Auto();
        auto2.snelheid = 10;
        auto2.merk = "Volvo";


        Auto auto3 = new Auto();
        auto3.snelheid = 20;
        auto3.merk = "Volkswagen";


        auto1.start();
        auto1.geefGas();
        auto1.geefGas();
        auto1.geefGas();
        auto1.stop();

        System.out.println("De kilometerstand van " + auto1.merk + " is " + (auto1.Kilometerstand()));

        auto2.start();
        auto2.geefGas();
        auto2.geefGas();
        auto2.geefGas();
        auto2.stop();

        System.out.println("De kilometerstand van " + auto2.merk + " is " + (auto2.Kilometerstand()));

        auto3.start();
        auto3.geefGas();
        auto3.geefGas();
        auto3.geefGas();
        auto3.stop();


        System.out.println("De kilometerstand van " + auto3.merk + " is " + (auto3.Kilometerstand()));


    }

    int Kilometerstand() {

        return kilometerstand;}


        void start () {
            System.out.println("De " + merk + " start");
        }

        void stop () {
            System.out.println("De " + merk + " stopt");

        }

        void geefGas () {
            snelheid += 20;
            kilometerstand += 20;
            //   System.out.println("De "+merk+" rijdt");
            System.out.println("De " + merk + " heeft snelheid " + snelheid);

        }

    }
