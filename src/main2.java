public class main2 {
    public static void main(String[] args) {
        Car car = new Car(5);

        // Wywołanie przesłoniętych metod
        car.start();  // -> Samochód został uruchomiony.
        car.stop();   // -> Samochód został zatrzymany.

        System.out.println("Liczba miejsc w samochodzie: " + car.getNumberOfSeats());
    }
}
