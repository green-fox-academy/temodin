package AircraftCarrier;

public class Main {

    public static void main(String[] args) {
        AircraftF16 f16_1 = new AircraftF16();
        f16_1.getAircraftProperties();

        System.out.println(f16_1.refill(20));
        f16_1.getAircraftProperties();

        Carrier carrier1 = new Carrier(50,50);

        carrier1.addAircraftF16();
        carrier1.addAircraftF16();
        carrier1.addAircraftF16();
        carrier1.addAircraftF35();
        carrier1.addAircraftF35();
        carrier1.addAircraftF35();
        carrier1.carrierInfo();

        carrier1.fill();
        carrier1.carrierInfo();



    }
}
