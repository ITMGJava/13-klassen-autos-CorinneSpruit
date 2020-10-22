public class Auto {

    static int snelheid = 0;
    static String merk = "Toyota";
    static int kilometerstand = 10000;
    Auto auto1 = new Auto();
    Auto auto2 = new Auto();
    Auto auto3 = new Auto();

    public static void main (String [] arg){


start ();

geefGas();
geefGas();
geefGas();

stop();
System.out.println("De kilometerstand van "+merk+ " is "+(getKilometerstand()));


    }

    private static int getKilometerstand() {
        return kilometerstand;

    }

    static void start(){
        System.out.println("De "+merk+" start");
    }

    static void stop(){
        System.out.println("De "+merk+" stopt");

    }

    static void geefGas(){
        snelheid+=20;
        kilometerstand+=20;
     //   System.out.println("De "+merk+" rijdt");
        System.out.println("De "+merk+ " heeft snelheid "+snelheid);

    }

}
