package day0205.AnimalTest;

public abstract class Animal {
    private int speed;
    private double distance;


    public Animal(int speed){  //스피드 초기화
        this.speed = speed;
    }

    public abstract void run(int hours);



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
