public class VehicleDemo {
    public static void main(String[] args) {
        VehicleFactory carFactory=new CarFactory();
        Vehicle car=carFactory.createVehicle();
        car.drive();

        VehicleFactory busFactory=new BusFactory();
        Vehicle bus=busFactory.createVehicle();
        bus.drive();
    }
}
