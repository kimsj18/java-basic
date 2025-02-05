package day0205.실습;

public class Cat extends Tail implements Animal, Pet{
    public Cat(){}

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void play() {
        System.out.println("노는중");

    }
}
