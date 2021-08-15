package lesson6;

public class PolyApp {
    public static void main(String[] args) {
        // is a
        Transport bus = new Bus("a123bc", 40, "Liaz");

        Transport miniBus = new MiniBus("b345ce", 20, "Gazel", "Shanson");


        Transport riverShip = new RiverShip("admiral", 100, 500);

        Transport[] transports = new Transport[] {bus, miniBus, riverShip};

        //Bus[] beses = new Bus[]{bus, miniBus}

        for (Transport transport : transports) {
            if (transport instanceof WaterTransport) {
                System.out.println(transport +" is a ship");
            }
            if (transport.getCapacity() < 30) {
                continue;
            }
            System.out.println(transport);
        }


    }
}
