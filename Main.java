public class Main {
    public static void main(String[] args) {
        Park myPark = new Park("Wonderland Park");
        Park.Attraction rollerCoaster = myPark.new Attraction("Roller Coaster", 8, 25);
        Park.Attraction ferrisWheel = myPark.new Attraction("Ferris Wheel", 10, 20);
        System.out.println(rollerCoaster.getInfo());
        System.out.println(ferrisWheel.getInfo());
    }
}