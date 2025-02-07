package day0205;

class Animal {
    void speak() {
        System.out.println("Animal speaking");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barking");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Animal 타입의 참조 변수로 Dog 객체를 생성

        // Dog 객체가 Dog 클래스의 인스턴스인지 확인
        if (animal instanceof Dog) {
            System.out.println("animal은 Dog의 인스턴스입니다.");
        }

        // Animal 객체가 Animal 클래스의 인스턴스인지 확인
        if (animal instanceof Animal) {
            System.out.println("animal은 Animal의 인스턴스입니다.");
        }

        // String 클래스와 비교 (false)
        if (animal instanceof Dog) {
            System.out.println("animal은 String의 인스턴스입니다.");
        } else {
            System.out.println("animal은 String의 인스턴스가 아닙니다.");
        }

    }
}
