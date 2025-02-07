package day0206.VehicleEx;//package day1.ex02;

public class DriverMain {
public static void main(String[] args) {
    Driver driver = new Driver();

   // Bus bus = new Bus();
    driver.drive(new Bus());

   // Taxi taxi = new Taxi();
    driver.drive(new Taxi());

    driver.drive((new Hourse()));

}


}
