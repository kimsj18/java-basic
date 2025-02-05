package day0203.day01;

public class AirPlaneMain {
    public static void main(String[] args) {
        //AirPlane 생성, 이륙, 날다, 착륙하다 수행
        AirPlane airPlane = new AirPlane();

        airPlane.land();
        airPlane.takeOff();
        airPlane.fly();

        //SuperAirPlane 생성, 이륙, 날다, 착륙 수행
        SuperAirPlane superAirPlane = new SuperAirPlane();

        superAirPlane.takeOff();
        superAirPlane.flyMode = SuperAirPlane.ADVANCED;
        superAirPlane.fly();
        superAirPlane.land();

    }
}
