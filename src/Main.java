// Klasa główna (z metodą main)
public class Main {
    public static void main(String[] args) {
        Car car = new Car(5); // Tworzenie instancji klasy Car

        // Wywoływanie metod z klasy bazowej
        car.start();
        car.stop();

        // Wywoływanie metody specyficznej dla klasy Car
        System.out.println("Liczba miejsc w samochodzie: " + car.getNumberOfSeats());
    }
}
