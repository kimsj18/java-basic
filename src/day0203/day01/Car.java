package day0203.day01;

public class Car {
    public int speed;

    public final void stop(){
        System.out.println("차를 멈춤");
        this.speed = 0;
    }

    public void speedUp(){
        this.speed += 1;
    }
}
