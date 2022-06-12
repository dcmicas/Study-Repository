package Ex02_Car;

public class CarTests {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Car #01";
        car.model = "Volvo";
        car.year = 2000;

        Car car2 = new Car();
        car2.name = "Car #02";
        car2.model = "Fusca";
        car2.year = 1983;

        System.out.println(car.name+ " is a " +car.model+ ", year " +car.year);
        System.out.println(car2.name+ " is a " +car2.model+ ", year " +car2.year);
    }


}
