package day0203.day01;

public class SportsCar extends Car {

    @Override
    public void speedUp() {
        this.speed += 10;
    }

    @Override
    public String toString() {
        return "현재 스피드는 " + this.speed;
    }
}
