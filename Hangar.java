public class Hangar {
    public static void main(String[] args) {
        Car capture = new Car("Capture", 13000);
        capture.setKilometers(13000);
        Boat costaeuropa = new Boat("Costa-Europa", 700000);
        costaeuropa.setKilometers(700000);

        System.out.println("Car : " + capture.doStuff());
        System.out.println("Boat : " + costaeuropa.doStuff());
    }
}
