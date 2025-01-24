package day13;

class animal{
    void eat(){
        System.out.println("먹이를 먹다.");
    }
}
class Cat extends animal {
    void meow() {
        System.out.println("야옹하고 울다");
    }
}
class Dog extends animal {
    void bark() {
        System.out.println("멍멍하고 짖다.");
    }
}
public class AnimalEx {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1= new Dog();

        cat1.meow();
        cat1.eat();
        dog1.bark();
        dog1.eat();
    }
}



