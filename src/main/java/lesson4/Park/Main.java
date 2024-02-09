package lesson4.Park;

public class Main {
    public static void main(String[] args) {
        Park attractions = new Park();
        attractions.addAttraction("Carousel", "10.00 - 22.00", 150);
        attractions.addAttraction("Karaoke", "10.00 - 21.00", 100);
        attractions.addAttraction("Dance machine", "10.00 - 18.00", 200);
        attractions.addAttraction("Puncher", "10.00 - 19.00", 20);

        attractions.showAttractionsInfo();
    }
}
