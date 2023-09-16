

public class ProgramToInterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}