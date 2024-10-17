public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();



        vehicle.start();
        car.start();
        electricCar.start();
    }
}
