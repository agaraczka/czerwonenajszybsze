public class vehicle22 {
    private int numberOfSeats;

    public void Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Nadpisana metoda start()
    public void start() {
        System.out.println("Samochód został uruchomiony.");
    }

    // Nadpisana metoda stop()
    public void stop() {
        System.out.println("Samochód został zatrzymany.");
    }
}
