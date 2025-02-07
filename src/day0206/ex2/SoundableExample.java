package day0206.ex2;

class Dog implements Soundable{

    @Override
    public String sound() {
        return "멍멍";
    }
}

class Cat implements Soundable{

    @Override
    public String sound() {
        return "야옹";
    }
}


public class SoundableExample {
    public static void pringSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        pringSound(new Cat());
        pringSound(new Dog());
    }

}
