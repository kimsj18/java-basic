package day0205.AnimalTest;

public class Dog extends Animal {

    public Dog(int speed){
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getDistance()+getSpeed()*hours*0.5);

    }

}
